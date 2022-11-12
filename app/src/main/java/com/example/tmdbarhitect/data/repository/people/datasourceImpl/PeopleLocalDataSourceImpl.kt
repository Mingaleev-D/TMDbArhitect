package com.example.tmdbarhitect.data.repository.people.datasourceImpl

import com.example.tmdbarhitect.data.database.PeopleDao
import com.example.tmdbarhitect.data.model.people.ResultP
import com.example.tmdbarhitect.data.repository.people.datasource.PeopleLocalDatasource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class PeopleLocalDataSourceImpl(
   private val peopleDao: PeopleDao
): PeopleLocalDatasource {

   override suspend fun getPeopleFromDB(): List<ResultP> {
      return peopleDao.getPeople()
   }

   override suspend fun savePeopleToDB(people: List<ResultP>) {
      CoroutineScope(Dispatchers.IO).launch {
         peopleDao.savePeople(people)
      }
   }

   override suspend fun clearAll() {
      CoroutineScope(Dispatchers.IO).launch {
         peopleDao.deleteAllPeople()
      }
   }
}