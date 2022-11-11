package com.example.tmdbarhitect.data.repository.people.datasource

import com.example.tmdbarhitect.data.model.people.ResultP

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface PeopleCacheDatasourse {
   suspend fun getPeopleFromCache():List<ResultP>
   suspend fun savePeopleToCache(people:List<ResultP>)
}