package com.dicoding.filmku.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.filmku.data.TvShow
import com.dicoding.filmku.databinding.ActivityDetailTvBinding

class DetailTvActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var detailTvActivityBinding: ActivityDetailTvBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailTvActivityBinding = ActivityDetailTvBinding.inflate(layoutInflater)
        setContentView(detailTvActivityBinding.root)

        val extras = intent.getParcelableExtra<TvShow>(EXTRA_DATA)
        if (extras != null) {
            val tvTitle = extras.title
            val tvDescription = extras.description
            val tvImg = extras.img

            detailTvActivityBinding.tvTitle.text = tvTitle.toString()
            detailTvActivityBinding.tvDescription.text = tvDescription.toString()
            Glide.with(this)
                .load(tvImg)
                .apply(RequestOptions().override(100, 100))
                .into(detailTvActivityBinding.tvImage)

        }
    }
}