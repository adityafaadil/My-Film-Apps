package com.dicoding.filmku.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.filmku.data.TvShow
import com.dicoding.filmku.databinding.ActivityDetailTvBinding

class DetailTvActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var binding: ActivityDetailTvBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailTvBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(this,
            ViewModelProvider.NewInstanceFactory())[DetailTvViewModel::class.java]

        val extras = intent.extras
        if (extras != null) {
            val showId = extras.getString(EXTRA_DATA)
            if (showId != null) {
                viewModel.setSelectedTvShow(showId)
                populateTvShow(viewModel.getTvShow())
            }
        }
    }

    private fun populateTvShow(tvShow: TvShow){
        binding.tvTitle.text = tvShow.title
        binding.tvDescription.text = tvShow.description
        Glide.with(this)
            .load(tvShow.img)
            .apply(RequestOptions().override(100, 100))
            .into(binding.tvImage)
    }
}