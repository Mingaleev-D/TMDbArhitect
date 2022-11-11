package com.example.tmdbarhitect.data.repository.tv.datasourceImpl

import com.example.tmdbarhitect.data.model.tv.ResultTV
import com.example.tmdbarhitect.data.repository.tv.datasource.TVCacheDatasourse

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class TVCacheDataSourceImpl : TVCacheDatasourse {
   private var tvList = ArrayList<ResultTV>()
   override suspend fun getTVFromCache(): List<ResultTV> {
      return tvList
   }

   override suspend fun saveTVToCache(tv: List<ResultTV>) {
      tvList.clear()
      tvList = ArrayList(tv)
   }
}