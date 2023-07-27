package com.ec3.dylan.myapplication.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.ec3.dylan.myapplication.databinding.ItemMovieBinding
import com.ec3.dylan.myapplication.model.Movie

class RVMovieListAdapter(var movies : List<Movie>) : RecyclerView.Adapter<MovieVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieVH {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieVH(binding)
    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieVH, position: Int) {
        holder.bind(movies[position])
    }

}
    /**/
    class MovieVH(private val binding : ItemMovieBinding) : ViewHolder(binding.root) {
        fun bind(movie : Movie) {
            binding.txtmovietitle.text = movie.originalTitle
            val baseImageUrl = "https://image.tmdb.org/t/p/"
            val posterSize = "w300"
            val posterPath = movie.posterPath
            val imageUrl = "$baseImageUrl$posterSize$posterPath"
            /*Glide*/
            Glide.with(binding.root)
                .load(imageUrl)
                .into(binding.imgmovieposter)
            binding.txtmovieoverview.text = movie.overview
            binding.txtmovierelease.text = movie.releaseDate
        }
    }