package com.example.tmdbarhitect.data.repository.tv.datasource

import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.data.model.tv.ResultTV

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

interface TVCacheDatasourse {
   suspend fun getTVFromCache():List<ResultTV>
   suspend fun saveTVToCache(tv:List<ResultTV>)
}