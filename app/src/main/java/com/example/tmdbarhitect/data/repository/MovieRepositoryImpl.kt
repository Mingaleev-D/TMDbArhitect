package com.example.tmdbarhitect.data.repository

import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.domain.repository.MovieRepository

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class MovieRepositoryImpl:MovieRepository {
   override suspend fun getMovies(): List<ResultM>? {
      TODO("Not yet implemented")
   }

   override suspend fun updateMovies(): List<ResultM>? {
      TODO("Not yet implemented")
   }
}