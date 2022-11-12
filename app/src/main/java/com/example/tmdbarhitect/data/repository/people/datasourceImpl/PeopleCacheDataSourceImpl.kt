package com.example.tmdbarhitect.data.repository.people.datasourceImpl

import com.example.tmdbarhitect.data.model.people.ResultP
import com.example.tmdbarhitect.data.repository.people.datasource.PeopleCacheDatasourse

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class PeopleCacheDataSourceImpl: PeopleCacheDatasourse {
   private var peopleList = ArrayList<ResultP>()

   override suspend fun getPeopleFromCache(): List<ResultP> {
      return peopleList
   }

   override suspend fun savePeopleToCache(people: List<ResultP>) {
      peopleList.clear()
      peopleList = ArrayList(people)
   }

}