@file:Suppress("IllegalIdentifier")

package com.sample.marvelgallery

import com.sample.marvelgallery.helpers.BaseMainView
import com.sample.marvelgallery.helpers.BaseMarvelRepository
import com.sample.marvelgallery.helpers.Example.exampleCharacterList
import com.sample.marvelgallery.helpers.fail
import com.sample.marvelgallery.model.MarvelCharacter
import com.sample.marvelgallery.presenter.MainPresenter
import io.reactivex.Single
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


class MainPresenterTest {

    /* We need to define trampoline schedulers to be sure that all
       reactive operations will be called before test will finish */
    @Before
    fun setUp() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setIoSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setComputationSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setNewThreadSchedulerHandler { Schedulers.trampoline() }
    }

    @Test
    fun `After view was created, list of characters is loaded and displayed`() {
        assertOnAction { onViewCreated() }.thereIsSameListDisplayed()
    }

    @Test
    fun `New list is shown after view was refreshed`() {
        assertOnAction { onRefresh() }.thereIsSameListDisplayed()
    }

    @Test
    fun `When API returns error, it is displayed on view`() {
        // Given
        val someError = Error()
        var errorDisplayed: Throwable? = null
        val view = BaseMainView(
                onShow = { _ -> fail() },
                onShowError = { errorDisplayed = it }
        )
        val marvelRepository = BaseMarvelRepository { Single.error(someError) }
        val mainPresenter = MainPresenter(view, marvelRepository)
        // When
        mainPresenter.onViewCreated()
        // Then
        assertEquals(someError, errorDisplayed)
    }

    @Test
    fun `When presenter is waiting for response, refresh is displayed`() {
        // Given
        val view = BaseMainView(refresh = false)
        val marvelRepository = BaseMarvelRepository(
                onGetCharacters = {
                    Single.fromCallable {
                        // Then
                        assertTrue(view.refresh)
                        exampleCharacterList
                    }
                }
        )
        val mainPresenter = MainPresenter(view, marvelRepository)
        view.onShow = { _ ->
            // Then
            assertTrue(view.refresh)
        }
        // When
        mainPresenter.onViewCreated()
        // Then
        assertFalse(view.refresh)
    }


    private fun assertOnAction(action: MainPresenter.() -> Unit) = PresenterActionAssertion(action)

    private class PresenterActionAssertion(val actionOnPresenter: MainPresenter.() -> Unit) {

        fun thereIsSameListDisplayed() {
            // Given
            var displayedList: List<MarvelCharacter>? = null
            val view = BaseMainView(
                    onShow = { list -> displayedList = list },
                    onShowError = { fail() }
            )
            val marvelRepository = BaseMarvelRepository { Single.just(exampleCharacterList) }
            val mainPresenter = MainPresenter(view, marvelRepository)

            // When
            mainPresenter.actionOnPresenter()

            // Then
            assertEquals(exampleCharacterList, displayedList)
        }
    }
}