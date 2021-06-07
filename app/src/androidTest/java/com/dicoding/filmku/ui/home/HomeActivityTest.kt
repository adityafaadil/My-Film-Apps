package com.dicoding.filmku.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.dicoding.filmku.R
import com.dicoding.filmku.utils.MovieDummy
import com.dicoding.filmku.utils.TvShowDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest{

    private val dummyMovie = MovieDummy.generateDummyMovie()
    private val dummyTvShow = TvShowDummy.generateDummyTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovie.size))
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.mv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.mv_title)).check(matches(withText(dummyMovie[0].title)))
        onView(withId(R.id.mv_description)).check(matches(isDisplayed()))
        onView(withId(R.id.mv_description)).check(matches(withText("${dummyMovie[0].description}")))
        onView(withId(R.id.mv_image)).check(matches(isDisplayed()))
    }

    @Test
    fun loadTvShow() {
        onView(withText("tv show")).perform(click())
        onView(withId(R.id.rv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_show)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
    }

    @Test
    fun loadDetailTvShow() {
        onView(withText("tv show")).perform(click())
        onView(withId(R.id.rv_show)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.tv_title)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title)).check(matches(withText(dummyTvShow[0].title)))
        onView(withId(R.id.tv_description)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description)).check(matches(withText("${dummyTvShow[0].description}")))
        onView(withId(R.id.tv_image)).check(matches(isDisplayed()))
    }
}