package com.example.cineease.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.cineease.Dao.CineEaseApplication
import com.example.cineease.Entity.Film
import com.example.cineease.Entity.Ticket
import com.example.cineease.Repository.MovieRepository
import com.example.cineease.Repository.TicketRepository
import kotlinx.coroutines.launch

class MovieViewModel(application: Application) : AndroidViewModel(application) {
    private val movieRepository: MovieRepository
    val movies: LiveData<List<Film>>

    init {
        val filmDao = (application as CineEaseApplication).database.filmDao()
        movieRepository = MovieRepository(filmDao)
        movies = liveData {
            emit(movieRepository.getMovies())
        }
    }
}

class TicketPurchaseViewModel(application: Application) : AndroidViewModel(application) {
    private val ticketRepository: TicketRepository
    private val _selectedTickets = MutableLiveData<List<Ticket>>()
    val selectedTickets: LiveData<List<Ticket>> get() = _selectedTickets

    init {
        val ticketDao = (application as CineEaseApplication).database.ticketDao()
        ticketRepository = TicketRepository(ticketDao)
    }

    fun addTicket(ticket: Ticket) {
        viewModelScope.launch {
            ticketRepository.insertTicket(ticket)
            _selectedTickets.value = _selectedTickets.value.orEmpty() + ticket
        }
    }

    fun calculateTotal(): Double {
        return _selectedTickets.value.orEmpty().sumOf { it.price }
    }
}
