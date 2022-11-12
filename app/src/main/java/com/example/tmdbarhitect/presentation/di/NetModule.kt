package com.example.tmdbarhitect.presentation.di

import com.example.tmdbarhitect.data.api.TMDBService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */
@Module
class NetModule(
   private val baseUrl: String
) {

   @Singleton
   @Provides
   fun provideRetrofit(): Retrofit {
      return Retrofit.Builder()
         .addConverterFactory(GsonConverterFactory.create())
         .baseUrl(baseUrl)
         .build()
   }

   @Singleton
   @Provides
   fun provideTMDBService(retrofit: Retrofit): TMDBService {
      return retrofit.create(TMDBService::class.java)
   }
}