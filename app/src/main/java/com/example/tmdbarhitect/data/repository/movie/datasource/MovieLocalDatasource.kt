package com.example.tmdbarhitect.data.repository.movie.datasource

import com.example.tmdbarhitect.data.model.movie.ResultM

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface MovieLocalDatasource {

   suspend fun getMovieFromDB():List<ResultM>
   suspend fun saveMovieToDB(movie:List<ResultM>)
   suspend fun clearAll()
}