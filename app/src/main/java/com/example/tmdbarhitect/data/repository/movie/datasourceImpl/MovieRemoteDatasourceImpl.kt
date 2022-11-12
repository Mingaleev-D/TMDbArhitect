package com.example.tmdbarhitect.data.repository.movie.datasourceImpl

import com.example.tmdbarhitect.data.api.TMDBService
import com.example.tmdbarhitect.data.model.movie.MovieListResponse
import com.example.tmdbarhitect.data.repository.movie.datasource.MovieRemoteDatasource
import retrofit2.Response

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class MovieRemoteDatasourceImpl(
   private val tmdbService: TMDBService
): MovieRemoteDatasource {
   override suspend fun getMovie(): Response<MovieListResponse> {
      return tmdbService.getPopularMovie()
   }
}