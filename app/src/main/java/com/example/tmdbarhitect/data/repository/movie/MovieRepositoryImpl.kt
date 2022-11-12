package com.example.tmdbarhitect.data.repository.movie

import android.util.Log
import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.data.repository.movie.datasource.MovieCacheDatasourse
import com.example.tmdbarhitect.data.repository.movie.datasource.MovieLocalDatasource
import com.example.tmdbarhitect.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.tmdbarhitect.domain.repository.MovieRepository

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class MovieRepositoryImpl(
   private val movieRemoteDatasource: MovieRemoteDatasource,
   private val movieLocalDatasource: MovieLocalDatasource,
   private val movieCacheDatasourse: MovieCacheDatasourse
) : MovieRepository {
   override suspend fun getMovies(): List<ResultM>? {
      return getMovieFromCache()
   }

   override suspend fun updateMovies(): List<ResultM>? {
      val newListOfMovie = getMovieFromApi()
      movieLocalDatasource.clearAll()
      movieLocalDatasource.saveMovieToDB(newListOfMovie)
      movieCacheDatasourse.saveMovieToCache(newListOfMovie)
      return newListOfMovie
   }

   suspend fun getMovieFromApi(): List<ResultM> {
      lateinit var moviesList: List<ResultM>
      try {
         val response = movieRemoteDatasource.getMovie()
         val body = response.body()
         if (body != null) {
            moviesList = body.results
         }

      } catch (e: Exception) {
         Log.i("TAG", "getMovieFromApi: ${e.message.toString()}")
      }

      return moviesList
   }

   suspend fun getMovieFromDB(): List<ResultM> {
      lateinit var moviesList: List<ResultM>
      try {
         moviesList = movieLocalDatasource.getMovieFromDB()

      } catch (e: Exception) {
         Log.i("TAG", "getMovieFromApi: ${e.message.toString()}")
      }
      if(moviesList.size>0){
         return moviesList
      }else{
         moviesList = getMovieFromApi()
         movieLocalDatasource.saveMovieToDB(moviesList)
      }

      return moviesList
   }

   suspend fun getMovieFromCache():List<ResultM>{
      lateinit var moviesList:List<ResultM>
      try {
     moviesList = movieCacheDatasourse.getMovieFromCache()
      }catch (e:Exception){
         Log.i("TAG", "getMovieFromApi: ${e.message.toString()}")
      }
      if(moviesList.size != 0) {
         return moviesList
      }
      else{
         moviesList = getMovieFromDB()
         movieCacheDatasourse.saveMovieToCache(moviesList)
      }

      return moviesList
   }
}