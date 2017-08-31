package com.sample.marvelgallery

import android.support.test.InstrumentationRegistry.getInstrumentation
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.test.suitebuilder.annotation.LargeTest
import android.widget.TextView
import com.sample.marvelgallery.helpers.Example
import com.sample.marvelgallery.view.character.CharacterProfileActivity
import org.hamcrest.Matchers.allOf
import org.hamcrest.Matchers.instanceOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class CharacterProfileActivityTest {

    @Rule @JvmField val activityTestRule = ActivityTestRule(CharacterProfileActivity::class.java, false, false)

    @Test
    fun characterActivityTest() {
        val context = getInstrumentation().targetContext
        val character = Example.exampleCharacter
        activityTestRule.launchActivity(CharacterProfileActivity.getIntent(context, character))

        // Character name is displayed
        onView(allOf(instanceOf(TextView::class.java), withParent(withId(R.id.toolbar))))
                .check(matches(withText(character.name)))

        // Character description is displayed
        onView(withId(R.id.descriptionView))
                .check(matches(withText(character.description)))
    }
}
