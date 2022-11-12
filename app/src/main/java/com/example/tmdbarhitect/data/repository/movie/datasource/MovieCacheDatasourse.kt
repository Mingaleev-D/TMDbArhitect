package com.example.tmdbarhitect.data.repository.movie.datasource

import com.example.tmdbarhitect.data.model.movie.ResultM

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface MovieCacheDatasourse {
   suspend fun getMovieFromCache():List<ResultM>
   suspend fun saveMovieToCache(movie:List<ResultM>)
}