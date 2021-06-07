package com.dicoding.filmku.ui.movies

import androidx.lifecycle.ViewModel
import com.dicoding.filmku.data.Movie
import com.dicoding.filmku.utils.MovieDummy

class MovieViewModel: ViewModel() {

    fun getMovie(): List<Movie> = MovieDummy.generateDummyMovie()
}