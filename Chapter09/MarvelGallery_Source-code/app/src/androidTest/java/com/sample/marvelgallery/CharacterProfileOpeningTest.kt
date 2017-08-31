package com.sample.marvelgallery

import android.content.Intent
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition
import android.support.test.espresso.matcher.ViewMatchers.isDisplayed
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.support.v7.widget.RecyclerView
import com.sample.marvelgallery.data.MarvelRepository
import com.sample.marvelgallery.helpers.BaseMarvelRepository
import com.sample.marvelgallery.helpers.Example.exampleCharacterList
import com.sample.marvelgallery.view.main.MainActivity
import io.reactivex.Single
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CharacterProfileOpeningTest {

    @Rule @JvmField val activityTestRule = ActivityTestRule(MainActivity::class.java, false, false)

    @Before
    fun setUp() {
        MarvelRepository.override = BaseMarvelRepository(
                onGetCharacters = { query -> Single.just(exampleCharacterList.filter { query == null || query in it.name }) }
        )
        activityTestRule.launchActivity(Intent())
    }

    @Test
    fun On_character_clicked_there_is_character_activity_opened() {
        onView(withId(R.id.recyclerView))
                .perform(actionOnItemAtPosition<RecyclerView.ViewHolder>(0, ViewActions.click()))
        onView(withId(R.id.character_detail_layout))
                .check(matches(isDisplayed()))
    }
}
