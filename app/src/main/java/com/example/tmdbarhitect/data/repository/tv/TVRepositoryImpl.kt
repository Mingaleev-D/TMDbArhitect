package com.example.tmdbarhitect.data.repository.tv

import android.util.Log
import com.example.tmdbarhitect.data.model.tv.ResultTV
import com.example.tmdbarhitect.data.repository.tv.datasource.TVCacheDatasourse
import com.example.tmdbarhitect.data.repository.tv.datasource.TVLocalDatasource
import com.example.tmdbarhitect.data.repository.tv.datasource.TVRemoteDatasource
import com.example.tmdbarhitect.domain.repository.TVRepository

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class TVRepositoryImpl(
   private val tvRemoteDatasource: TVRemoteDatasource,
   private val tvLocalDatasource: TVLocalDatasource,
   private val tvCacheDatasourse: TVCacheDatasourse
) : TVRepository {

   override suspend fun getTV(): List<ResultTV>? {
      return getTVFromCache()
   }

   override suspend fun updateTV(): List<ResultTV>? {
      val newListOfTV = getTVFromApi()
      tvLocalDatasource.clearAll()
      tvLocalDatasource.saveTVToDB(newListOfTV)
      tvCacheDatasourse.saveTVToCache(newListOfTV)
      return newListOfTV
   }


   suspend fun getTVFromApi(): List<ResultTV> {
      lateinit var tvsList: List<ResultTV>
      try {
         val response = tvRemoteDatasource.getTV()
         val body = response.body()
         if (body != null) {
            tvsList = body.results
         }

      } catch (e: Exception) {
         Log.i("TAG", "getMovieFromApi: ${e.message.toString()}")
      }

      return tvsList
   }

   suspend fun getTVFromDB(): List<ResultTV> {
      lateinit var tvsList: List<ResultTV>
      try {
         tvsList = tvLocalDatasource.getTVFromDB()

      } catch (e: Exception) {
         Log.i("TAG", "getMovieFromApi: ${e.message.toString()}")
      }
      if (tvsList.size > 0) {
         return tvsList
      } else {
         tvsList = getTVFromApi()
         tvLocalDatasource.saveTVToDB(tvsList)
      }

      return tvsList
   }

   suspend fun getTVFromCache(): List<ResultTV> {
      lateinit var tvsList: List<ResultTV>
      try {
         tvsList = tvCacheDatasourse.getTVFromCache()
      } catch (e: Exception) {
         Log.i("TAG", "getMovieFromApi: ${e.message.toString()}")
      }
      if (tvsList.size != 0) {
         return tvsList
      } else {
         tvsList = getTVFromDB()
         tvCacheDatasourse.saveTVToCache(tvsList)
      }

      return tvsList
   }

}