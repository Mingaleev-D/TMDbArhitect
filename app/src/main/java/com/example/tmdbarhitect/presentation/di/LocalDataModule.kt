package com.example.tmdbarhitect.presentation.di

import com.example.tmdbarhitect.data.database.MovieDao
import com.example.tmdbarhitect.data.database.PeopleDao
import com.example.tmdbarhitect.data.database.TVDao
import com.example.tmdbarhitect.data.repository.movie.datasource.MovieLocalDatasource
import com.example.tmdbarhitect.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.example.tmdbarhitect.data.repository.people.datasource.PeopleLocalDatasource
import com.example.tmdbarhitect.data.repository.people.datasourceImpl.PeopleLocalDataSourceImpl
import com.example.tmdbarhitect.data.repository.tv.datasource.TVLocalDatasource
import com.example.tmdbarhitect.data.repository.tv.datasourceImpl.TVLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */
@Module
class LocalDataModule {

   @Singleton
   @Provides
   fun provideMovieLocalDataSource(movie: MovieDao): MovieLocalDatasource {
      return MovieLocalDataSourceImpl(movie)
   }

   @Singleton
   @Provides
   fun provideTVLocalDataSource(tv: TVDao): TVLocalDatasource {
      return TVLocalDataSourceImpl(tv)
   }

   @Singleton
   @Provides
   fun providePeopleLocalDataSource(people: PeopleDao): PeopleLocalDatasource {
      return PeopleLocalDataSourceImpl(people)
   }
}