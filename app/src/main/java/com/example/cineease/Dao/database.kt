package com.example.cineease.Dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.cineease.Entity.Film
import com.example.cineease.Entity.Snack
import com.example.cineease.Entity.Ticket

@Database(entities = [Film::class, Ticket::class, Snack::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun filmDao(): FilmDao
    abstract fun ticketDao(): TicketDao
    abstract fun snackDao(): SnackDao
}
