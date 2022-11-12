package com.example.tmdbarhitect.data.repository.people.datasource

import com.example.tmdbarhitect.data.model.people.PeopleListResponse
import retrofit2.Response

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface PeopleRemoteDatasource {

   suspend fun getPeople(): Response<PeopleListResponse>
}