package com.example.tmdbarhitect.data.repository.people.datasource

import com.example.tmdbarhitect.data.model.people.ResultP

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface PeopleLocalDatasource {

   suspend fun getPeopleFromDB():List<ResultP>
   suspend fun savePeopleToDB(people:List<ResultP>)
   suspend fun clearAll()
}