package com.dicoding.filmku.ui.detail

import com.dicoding.filmku.utils.MovieDummy
import com.dicoding.filmku.utils.TvShowDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailTvViewModelTest {
    private lateinit var viewModel: DetailTvViewModel
    private val dummyTvShow = TvShowDummy.generateDummyTvShow()[0]
    private val showId = dummyTvShow.showId

    @Before
    fun setUp() {
        viewModel = DetailTvViewModel()
        viewModel.setSelectedTvShow(showId)
    }

    @Test
    fun getTvShow() {
        viewModel.setSelectedTvShow(dummyTvShow.showId)
        val tvSHowEntity = viewModel.getTvShow()
        assertNotNull(tvSHowEntity)
        assertEquals(dummyTvShow.showId, tvSHowEntity.showId)
        assertEquals(dummyTvShow.img, tvSHowEntity.img)
        assertEquals(dummyTvShow.title, tvSHowEntity.title)
        assertEquals(dummyTvShow.description, tvSHowEntity.description)
        assertEquals(dummyTvShow.release, tvSHowEntity.release)
    }
}