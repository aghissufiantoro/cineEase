package com.example.cineease.Repository

import com.example.cineease.Dao.FilmDao
import com.example.cineease.Dao.SnackDao
import com.example.cineease.Dao.TicketDao
import com.example.cineease.Entity.Film
import com.example.cineease.Entity.Snack
import com.example.cineease.Entity.Ticket

class MovieRepository(private val filmDao: FilmDao) {
    suspend fun getMovies() = filmDao.getAllFilms()
    suspend fun insertMovie(film: Film) = filmDao.insertFilm(film)
}

class TicketRepository(private val ticketDao: TicketDao) {
    suspend fun getTicketsByFilmId(filmId: Int) = ticketDao.getTicketsByFilmId(filmId)
    suspend fun insertTicket(ticket: Ticket) = ticketDao.insertTicket(ticket)
}

class SnackRepository(private val snackDao: SnackDao) {
    suspend fun getAllSnacks() = snackDao.getAllSnacks()
    suspend fun insertSnack(snack: Snack) = snackDao.insertSnack(snack)
}
