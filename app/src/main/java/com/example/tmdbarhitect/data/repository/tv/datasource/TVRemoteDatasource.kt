package com.example.tmdbarhitect.data.repository.tv.datasource

import com.example.tmdbarhitect.data.model.movie.MovieListResponse
import com.example.tmdbarhitect.data.model.tv.TVListResponse
import retrofit2.Response

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface TVRemoteDatasource {
   suspend fun getTV(): Response<TVListResponse>
}