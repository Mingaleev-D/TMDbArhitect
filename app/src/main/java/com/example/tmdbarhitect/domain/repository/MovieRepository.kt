package com.example.tmdbarhitect.domain.repository

import com.example.tmdbarhitect.data.model.movie.ResultM

/**
 * @author : Mingaleev D
 * @data : 10/11/2022
 */

interface MovieRepository {

   suspend fun getMovies():List<ResultM>?
   suspend fun updateMovies():List<ResultM>?
}