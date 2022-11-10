package com.example.tmdbarhitect.data.repository.movie.datasource

import com.example.tmdbarhitect.data.model.movie.MovieListResponse
import retrofit2.Response

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface MovieRemoteDatasource {

   suspend fun getMovie(): Response<MovieListResponse>
}