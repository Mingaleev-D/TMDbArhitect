package com.example.tmdbarhitect.domain.repository

import com.example.tmdbarhitect.data.model.people.ResultP
import com.example.tmdbarhitect.data.model.tv.ResultTV

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface TVRepository {

   suspend fun getTV():List<ResultTV>?
   suspend fun updateTV():List<ResultTV>?
}