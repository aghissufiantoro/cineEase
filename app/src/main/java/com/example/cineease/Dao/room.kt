package com.example.cineease.Dao

import android.app.Application
import androidx.room.Room

class CineEaseApplication : Application() {
    lateinit var database: AppDatabase

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "cineease-database"
        ).build()
    }
}
