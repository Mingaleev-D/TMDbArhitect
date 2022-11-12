package com.example.tmdbarhitect.data.repository.movie.datasourceImpl

import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.data.repository.movie.datasource.MovieCacheDatasourse

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class MovieCacheDataSourceImpl: MovieCacheDatasourse {
   private var movieList = ArrayList<ResultM>()

   override suspend fun getMovieFromCache(): List<ResultM> {
      return movieList
   }

   override suspend fun saveMovieToCache(movie: List<ResultM>) {
      movieList.clear()
      movieList = ArrayList(movie)
   }
}