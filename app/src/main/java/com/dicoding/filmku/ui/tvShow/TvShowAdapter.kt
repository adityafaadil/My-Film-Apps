package com.dicoding.filmku.ui.tvShow

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.filmku.R
import com.dicoding.filmku.data.TvShow
import com.dicoding.filmku.databinding.ItemTvBinding
import com.dicoding.filmku.ui.detail.DetailTvActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvViewHolder>() {
    private var tvShow = ArrayList<TvShow>()

    fun setTvShow(tvShows: List<TvShow>?) {
        if (tvShows == null) return
        this.tvShow.clear()
        this.tvShow.addAll(tvShows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvViewHolder {
        val mView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_tv, parent, false)
        return TvViewHolder(mView)
    }

    override fun onBindViewHolder(holder: TvViewHolder, position: Int) {
        holder.bind(tvShow[position])
    }

    override fun getItemCount() = tvShow.size

    inner class TvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemTvBinding.bind(itemView)
        fun bind(tvShow: TvShow) {
            binding.tvItemTitle.text = tvShow.title
            binding.tvItemRelease.text = tvShow.release
            Glide.with(itemView.context)
                .load(tvShow.img)
                .apply(RequestOptions().override(55, 55))
                .into(binding.imgPoster)

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, DetailTvActivity::class.java)
                intent.putExtra(DetailTvActivity.EXTRA_DATA, tvShow.showId)
                itemView.context.startActivity(intent)
            }
        }
    }
}