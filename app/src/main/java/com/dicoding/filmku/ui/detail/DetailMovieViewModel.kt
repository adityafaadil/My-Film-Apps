package com.dicoding.filmku.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.filmku.data.Movie
import com.dicoding.filmku.utils.MovieDummy

class DetailMovieViewModel : ViewModel() {

    private lateinit var movieId: String

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun getMovie(): Movie {
        lateinit var mv: Movie
        for (movie in MovieDummy.generateDummyMovie()) {
            if (movie.movieId == movieId ) {
                mv = movie
            }
        }
        return mv
    }
}