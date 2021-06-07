package com.dicoding.filmku.ui.movies

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.filmku.R
import com.dicoding.filmku.data.Movie
import com.dicoding.filmku.databinding.FragmentMovieBinding
import com.dicoding.filmku.ui.detail.DetailMovieActivity

class MovieFragment : Fragment() {

    private lateinit var fragmentMovieBinding: FragmentMovieBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentMovieBinding = FragmentMovieBinding.inflate(inflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MovieViewModel::class.java]
            val movie = viewModel.getMovie()
            val movieAdapter = MovieAdapter()
            movieAdapter.setMovie(movie)


            with(fragmentMovieBinding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                fragmentMovieBinding.rvMovie.adapter = movieAdapter

                movieAdapter.setOnItemClickCallback(
                    object : MovieAdapter.OnItemClickCallback {
                        override fun onItemClicked(data: Movie) {
                            showSelectedMovie(data)
                        }
                    }

                )

            }
        }
    }

    private fun showSelectedMovie(data: Movie) {
        Toast.makeText(context, "Kamu memilih ${data.title}", Toast.LENGTH_SHORT).show()
        val user = Movie(
            data.img,
            data.title,
            data.description,
        )
        val i = Intent(activity, DetailMovieActivity::class.java)
        i.putExtra(DetailMovieActivity.EXTRA_DATA, user)
        activity?.startActivity(i)

    }
}