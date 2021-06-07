package com.dicoding.filmku.ui.tvShow

import androidx.lifecycle.ViewModel
import com.dicoding.filmku.data.TvShow
import com.dicoding.filmku.utils.TvShowDummy

class TvShowViewModel : ViewModel() {

    fun getTvShow(): List<TvShow> = TvShowDummy.generateDummyTvShow()
}