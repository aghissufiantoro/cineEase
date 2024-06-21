package com.example.cineease.UI.movie

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cineease.R

data class Movie(val title: String, val description: String, val schedule: String)

class MovieAdapter(private val movies: List<Movie>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val moviePoster: ImageView = itemView.findViewById(R.id.imageViewMoviePoster)
        val movieTitle: TextView = itemView.findViewById(R.id.textViewMovieTitle)
        val movieDescription: TextView = itemView.findViewById(R.id.textViewMovieDescription)
        val movieSchedule: TextView = itemView.findViewById(R.id.textViewMovieSchedule)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movies[position]
        // Bind data to the views here
        holder.movieTitle.text = movie.title
        holder.movieDescription.text = movie.description
        holder.movieSchedule.text = movie.schedule
        // You can load the poster image using an image loading library like Glide or Picasso
    }

    override fun getItemCount(): Int = movies.size
}
