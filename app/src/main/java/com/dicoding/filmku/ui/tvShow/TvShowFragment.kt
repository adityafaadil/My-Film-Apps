package com.dicoding.filmku.ui.tvShow

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.filmku.data.TvShow
import com.dicoding.filmku.databinding.FragmentTvShowBinding
import com.dicoding.filmku.ui.detail.DetailTvActivity

class TvShowFragment : Fragment() {

    private lateinit var fragmentTvShowBinding: FragmentTvShowBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentTvShowBinding = FragmentTvShowBinding.inflate(inflater, container, false)
        return fragmentTvShowBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
            val tvShow = viewModel.getTvShow()

            val tvAdapter = TvShowAdapter()
            tvAdapter.setTvShow(tvShow)


            with(fragmentTvShowBinding.rvShow) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                fragmentTvShowBinding.rvShow.adapter = tvAdapter

                tvAdapter.setOnItemClickCallback(
                    object : TvShowAdapter.OnItemClickCallback {
                        override fun onItemClicked(data: TvShow) {
                            showSelected(data)
                        }
                    })
            }
        }
    }


    private fun showSelected(data: TvShow) {
        Toast.makeText(context, "Kamu memilih ${data.title}", Toast.LENGTH_SHORT).show()
        val user = TvShow(
            data.img,
            data.title,
            data.description,
        )
        val i = Intent(activity, DetailTvActivity::class.java)
        i.putExtra(DetailTvActivity.EXTRA_DATA, user)
        activity?.startActivity(i)

    }
}