package com.dicoding.filmku.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.filmku.data.Movie
import com.dicoding.filmku.databinding.ActivityDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding: ActivityDetailMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val extras = intent.getParcelableExtra<Movie>(EXTRA_DATA)
        if (extras != null) {
            val mvTitle = extras.title
            val mvDescription = extras.description
            val mvImage = extras.img

            binding.mvTitle.text = mvTitle.toString()
            binding.mvDescription.text = mvDescription.toString()
            Glide.with(this)
                .load(mvImage)
                .apply(RequestOptions().override(100, 100))
                .into(binding.mvImage)

        }
    }

}