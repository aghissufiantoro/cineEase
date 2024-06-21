package com.example.cineease.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.cineease.Entity.Film
import com.example.cineease.Entity.Snack
import com.example.cineease.Entity.Ticket

@Dao
interface FilmDao {
    @Insert
    suspend fun insertFilm(film: Film)

    @Query("SELECT * FROM films")
    suspend fun getAllFilms(): List<Film>
}

@Dao
interface TicketDao {
    @Insert
    suspend fun insertTicket(ticket: Ticket)

    @Query("SELECT * FROM tickets WHERE filmId = :filmId")
    suspend fun getTicketsByFilmId(filmId: Int): List<Ticket>
}

@Dao
interface SnackDao {
    @Insert
    suspend fun insertSnack(snack: Snack)

    @Query("SELECT * FROM snacks")
    suspend fun getAllSnacks(): List<Snack>
}
