package com.example.tmdbarhitect.data.repository.tv.datasource

import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.data.model.tv.ResultTV

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface TVLocalDatasource {

   suspend fun getTVFromDB():List<ResultTV>
   suspend fun saveTVToDB(tv:List<ResultTV>)
   suspend fun clearAll()
}