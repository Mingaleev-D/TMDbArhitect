package com.example.tmdbarhitect.domain.repository

import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.data.model.people.ResultP

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface PeopleRepository {

   suspend fun getPeoples():List<ResultP>?
   suspend fun updatePeoples():List<ResultP>?
}