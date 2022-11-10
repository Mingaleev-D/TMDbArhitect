package com.example.tmdbarhitect.data.repository.movie.datasourceImpl

import com.example.tmdbarhitect.data.database.MovieDao
import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.data.repository.movie.datasource.MovieLocalDatasource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class MovieLocalDataSourceImpl(
   private val movieDao:MovieDao
): MovieLocalDatasource {
   override suspend fun getMovieFromDB(): List<ResultM> {
      return movieDao.getMovies()
   }

   override suspend fun saveMovieToDB(movie: List<ResultM>) {
      CoroutineScope(Dispatchers.IO).launch {
         movieDao.saveMovie(movie)
      }
   }

   override suspend fun clearAll() {
      CoroutineScope(Dispatchers.IO).launch {
         movieDao.deleteAllMovies()
      }
   }
}