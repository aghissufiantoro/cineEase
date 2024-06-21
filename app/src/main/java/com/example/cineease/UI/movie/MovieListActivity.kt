package com.example.cineease.ui.movie

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cineease.R
import com.example.cineease.UI.movie.Movie
import com.example.cineease.UI.movie.MovieAdapter

class MovieListActivity : AppCompatActivity() {

    private lateinit var recyclerViewMovies: RecyclerView
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        recyclerViewMovies = findViewById(R.id.recyclerViewMovies)
        recyclerViewMovies.layoutManager = LinearLayoutManager(this)
        movieAdapter = MovieAdapter(getMovies())
        recyclerViewMovies.adapter = movieAdapter
    }

    private fun getMovies(): List<Movie> {
        // Replace this with your own data fetching logic
        return listOf(
            Movie("Movie 1", "Description 1", "12:00 PM"),
            Movie("Movie 2", "Description 2", "3:00 PM"),
            Movie("Movie 3", "Description 3", "6:00 PM")
        )
    }
}
