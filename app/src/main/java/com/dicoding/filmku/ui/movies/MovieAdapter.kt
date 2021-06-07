package com.dicoding.filmku.ui.movies

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.filmku.R
import com.dicoding.filmku.data.Movie
import com.dicoding.filmku.databinding.ItemMovieBinding

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var movie = ArrayList<Movie>()


    fun setMovie(movies: List<Movie>?) {
        if (movies == null) return
        this.movie.clear()
        this.movie.addAll(movies)
    }

    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val mView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(mView)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(movie[position])
    }

    override fun getItemCount() = movie.size

    interface OnItemClickCallback {
        fun onItemClicked(data: Movie)
    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemMovieBinding.bind(itemView)
        fun bind(movie: Movie) {
            binding.tvItemTitle.text = movie.title
            binding.tvItemRelease.text = movie.release
            Glide.with(itemView.context)
                .load(movie.img)
                .apply(RequestOptions().override(55, 55))
                .into(binding.imgPoster)

            itemView.setOnClickListener {
                onItemClickCallback?.onItemClicked(movie)

            }

        }
    }
}