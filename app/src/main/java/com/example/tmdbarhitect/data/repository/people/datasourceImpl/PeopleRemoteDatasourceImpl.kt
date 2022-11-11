package com.example.tmdbarhitect.data.repository.people.datasourceImpl

import com.example.tmdbarhitect.data.api.TMDBService
import com.example.tmdbarhitect.data.model.movie.MovieListResponse
import com.example.tmdbarhitect.data.model.people.PeopleListResponse
import com.example.tmdbarhitect.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.tmdbarhitect.data.repository.people.datasource.PeopleRemoteDatasource
import retrofit2.Response

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class PeopleRemoteDatasourceImpl(
   private val tmdbService: TMDBService
): PeopleRemoteDatasource {
   override suspend fun getPeople(): Response<PeopleListResponse> {
     return tmdbService.getPopularPeople()
   }

}