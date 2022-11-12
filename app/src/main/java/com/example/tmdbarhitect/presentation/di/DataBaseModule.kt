package com.example.tmdbarhitect.presentation.di

import android.content.Context
import androidx.room.Room
import com.example.tmdbarhitect.data.database.MovieDao
import com.example.tmdbarhitect.data.database.PeopleDao
import com.example.tmdbarhitect.data.database.TMDBDatabase
import com.example.tmdbarhitect.data.database.TVDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

@Module
class DataBaseModule {

   @Singleton
   @Provides
   fun provideMovieDatabase(context: Context): TMDBDatabase {
      return Room.databaseBuilder(context, TMDBDatabase::class.java, "tmdb_client")
         .build()
   }

   @Singleton
   @Provides
   fun provideMovieDao(tmdbDatabase: TMDBDatabase): MovieDao {
      return tmdbDatabase.movieDao()
   }

   @Singleton
   @Provides
   fun provideTVDao(tmdbDatabase: TMDBDatabase): TVDao {
      return tmdbDatabase.tvDao()
   }

   @Singleton
   @Provides
   fun providePeopleDao(tmdbDatabase: TMDBDatabase): PeopleDao {
      return tmdbDatabase.peopleDao()
   }
}