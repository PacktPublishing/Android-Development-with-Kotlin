@file:Suppress("IllegalIdentifier")

package com.sample.marvelgallery

import com.sample.marvelgallery.helpers.BaseMainView
import com.sample.marvelgallery.helpers.BaseMarvelRepository
import com.sample.marvelgallery.helpers.fail
import com.sample.marvelgallery.presenter.MainPresenter
import io.reactivex.Single
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test


class MainPresenterSearchTest {

    @Before
    fun setUp() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setIoSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setComputationSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setNewThreadSchedulerHandler { Schedulers.trampoline() }
    }

    @Test
    fun `After start, there is request for with null query`() {
        assertOnAction { onViewCreated() } searchQueryIsEqualTo null
    }

    @Test
    fun `For blank text, there is request with null query`() {
        for (emptyText in listOf("", "   ", "       "))
            assertOnAction { onSearchChanged(emptyText) } searchQueryIsEqualTo null
    }

    @Test
    fun `Search query is the same as provided text when not blank`() {
        for (text in listOf("KKO", "HJ HJ", "And so what?"))
            assertOnAction { onSearchChanged(text) } searchQueryIsEqualTo text
    }

    private fun assertOnAction(action: MainPresenter.() -> Unit) = PresenterActionAssertion(action)

    private class PresenterActionAssertion(val actionOnPresenter: MainPresenter.() -> Unit) {

        infix fun searchQueryIsEqualTo(expectedQuery: String?) {
            var checkApplied = false
            val view = BaseMainView(onShowError = { fail() })
            val marvelRepository = BaseMarvelRepository { searchQuery ->
                assertEquals(expectedQuery, searchQuery)
                checkApplied = true
                Single.never()
            }
            val mainPresenter = MainPresenter(view, marvelRepository)
            mainPresenter.actionOnPresenter()
            assertTrue(checkApplied)
        }
    }
}