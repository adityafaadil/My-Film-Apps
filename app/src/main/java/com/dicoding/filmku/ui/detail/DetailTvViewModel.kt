package com.dicoding.filmku.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.filmku.data.TvShow
import com.dicoding.filmku.utils.TvShowDummy

class DetailTvViewModel : ViewModel() {

    private lateinit var showId: String

    fun setSelectedTvShow(showId: String) {
        this.showId = showId
    }

    fun getTvShow(): TvShow {
        lateinit var tv: TvShow
        for (show in TvShowDummy.generateDummyTvShow()) {
            if (show.showId == showId ) {
                tv = show
            }
        }
        return tv
    }
}