package com.example.tmdbarhitect.data.repository.tv.datasourceImpl

import com.example.tmdbarhitect.data.api.TMDBService
import com.example.tmdbarhitect.data.model.tv.TVListResponse
import com.example.tmdbarhitect.data.repository.tv.datasource.TVRemoteDatasource
import retrofit2.Response

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class TVRemoteDatasourceImpl(
   private val tmdbService: TMDBService
): TVRemoteDatasource {
   override suspend fun getTV(): Response<TVListResponse> {
      return tmdbService.getPopularTV()
   }
}