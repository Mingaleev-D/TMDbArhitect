package com.example.tmdbarhitect.presentation.di

import com.example.tmdbarhitect.data.repository.movie.datasource.MovieCacheDatasourse
import com.example.tmdbarhitect.data.repository.movie.datasourceImpl.MovieCacheDataSourceImpl
import com.example.tmdbarhitect.data.repository.people.datasource.PeopleCacheDatasourse
import com.example.tmdbarhitect.data.repository.people.datasourceImpl.PeopleCacheDataSourceImpl
import com.example.tmdbarhitect.data.repository.tv.datasource.TVCacheDatasourse
import com.example.tmdbarhitect.data.repository.tv.datasourceImpl.TVCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */
@Module
class CachDataModule {

   @Singleton
   @Provides
   fun provideMovieCacheDataSource(): MovieCacheDatasourse {
      return MovieCacheDataSourceImpl()
   }
   @Singleton
   @Provides
   fun providePeopleCacheDataSource(): PeopleCacheDatasourse {
      return PeopleCacheDataSourceImpl()
   }
   @Singleton
   @Provides
   fun provideTVCacheDataSource(): TVCacheDatasourse {
      return TVCacheDataSourceImpl()
   }
}