package com.example.tmdbarhitect.data.repository.people

import android.util.Log
import com.example.tmdbarhitect.data.model.people.ResultP
import com.example.tmdbarhitect.data.repository.people.datasource.PeopleCacheDatasourse
import com.example.tmdbarhitect.data.repository.people.datasource.PeopleLocalDatasource
import com.example.tmdbarhitect.data.repository.people.datasource.PeopleRemoteDatasource
import com.example.tmdbarhitect.domain.repository.PeopleRepository

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class PeopleRepositoryImpl(
   private val peopleRemoteDatasource: PeopleRemoteDatasource,
   private val peopleLocalDatasource: PeopleLocalDatasource,
   private val peopleCacheDatasourse: PeopleCacheDatasourse
) : PeopleRepository {

   override suspend fun getPeoples(): List<ResultP>? {
      return getPeopleFromCache()
   }

   override suspend fun updatePeoples(): List<ResultP>? {
      val newListOfPeople = getPeopleFromApi()
      peopleLocalDatasource.clearAll()
      peopleLocalDatasource.savePeopleToDB(newListOfPeople)
      peopleCacheDatasourse.savePeopleToCache(newListOfPeople)
      return newListOfPeople
   }

   suspend fun getPeopleFromApi(): List<ResultP> {
      lateinit var peopleList: List<ResultP>
      try {
         val response = peopleRemoteDatasource.getPeople()
         val body = response.body()
         if (body != null) {
            peopleList = body.results
         }

      } catch (e: Exception) {
         Log.i("TAG", "getMovieFromApi: ${e.message.toString()}")
      }

      return peopleList
   }

   suspend fun getPeopleFromDB(): List<ResultP> {
      lateinit var peopleList: List<ResultP>
      try {
         peopleList = peopleLocalDatasource.getPeopleFromDB()

      } catch (e: Exception) {
         Log.i("TAG", "getMovieFromApi: ${e.message.toString()}")
      }
      if (peopleList.size > 0) {
         return peopleList
      } else {
         peopleList = getPeopleFromApi()
         peopleLocalDatasource.savePeopleToDB(peopleList)
      }

      return peopleList
   }

   suspend fun getPeopleFromCache(): List<ResultP> {
      lateinit var peopleList: List<ResultP>
      try {
         peopleList = peopleCacheDatasourse.getPeopleFromCache()
      } catch (e: Exception) {
         Log.i("TAG", "getMovieFromApi: ${e.message.toString()}")
      }
      if (peopleList.size != 0) {
         return peopleList
      } else {
         peopleList = getPeopleFromDB()
         peopleCacheDatasourse.savePeopleToCache(peopleList)
      }

      return peopleList
   }

}