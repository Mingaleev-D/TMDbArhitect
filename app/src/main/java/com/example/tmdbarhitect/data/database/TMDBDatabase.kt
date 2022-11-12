package com.example.tmdbarhitect.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.data.model.people.ResultP
import com.example.tmdbarhitect.data.model.tv.ResultTV

/**
 * @author : Mingaleev D
 * @data : 10/11/2022
 */
@Database(
   entities = [ResultM::class, ResultTV::class, ResultP::class],
   version = 1,
   exportSchema = false
)
abstract class TMDBDatabase : RoomDatabase() {

   abstract fun movieDao(): MovieDao
   abstract fun tvDao(): TVDao
   abstract fun peopleDao(): PeopleDao
}