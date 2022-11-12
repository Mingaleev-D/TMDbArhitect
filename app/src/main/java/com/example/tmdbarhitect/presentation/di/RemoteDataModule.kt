package com.example.tmdbarhitect.presentation.di

import com.example.tmdbarhitect.data.api.TMDBService
import com.example.tmdbarhitect.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.tmdbarhitect.data.repository.movie.datasourceImpl.MovieRemoteDatasourceImpl
import com.example.tmdbarhitect.data.repository.people.datasource.PeopleRemoteDatasource
import com.example.tmdbarhitect.data.repository.people.datasourceImpl.PeopleRemoteDatasourceImpl
import com.example.tmdbarhitect.data.repository.tv.datasource.TVRemoteDatasource
import com.example.tmdbarhitect.data.repository.tv.datasourceImpl.TVRemoteDatasourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */
@Module
class RemoteDataModule {

   @Singleton
   @Provides
   fun provideMovieRemoteDataSource(tmdbService: TMDBService): MovieRemoteDatasource {
      return MovieRemoteDatasourceImpl(tmdbService)
   }

   @Singleton
   @Provides
   fun provideTVRemoteDataSource(tmdbService: TMDBService): TVRemoteDatasource {
      return TVRemoteDatasourceImpl(tmdbService)
   }

   @Singleton
   @Provides
   fun providePeopleRemoteDataSource(tmdbService: TMDBService): PeopleRemoteDatasource {
      return PeopleRemoteDatasourceImpl(tmdbService)
   }
}