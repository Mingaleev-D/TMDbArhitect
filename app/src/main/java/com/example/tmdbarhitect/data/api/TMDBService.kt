package com.example.tmdbarhitect.data.api

import com.example.tmdbarhitect.data.model.movie.MovieListResponse
import com.example.tmdbarhitect.data.model.people.PeopleListResponse
import com.example.tmdbarhitect.data.model.tv.TVListResponse
import com.example.tmdbarhitect.utils.Constants.API_KEY
import com.example.tmdbarhitect.utils.Constants.BASE_LANGUAGE
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author : Mingaleev D
 * @data : 10/11/2022
 */

interface TMDBService {

   @GET("movie/popular")
   suspend fun getPopularMovie(
      @Query("api_key") apiKey: String = API_KEY,
      @Query("language") language: String = BASE_LANGUAGE
   ): Response<MovieListResponse>

   @GET("tv/popular")
   suspend fun getPopularTV(
      @Query("api_key") apiKey: String = API_KEY,
      @Query("language") language: String = BASE_LANGUAGE
   ): Response<TVListResponse>

   @GET("person/popular")
   suspend fun getPopularPeople(
      @Query("api_key") apiKey: String = API_KEY,
      @Query("language") language: String = BASE_LANGUAGE
   ): Response<PeopleListResponse>
}