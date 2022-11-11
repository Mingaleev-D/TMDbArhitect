package com.example.tmdbarhitect.data.repository.tv.datasourceImpl

import com.example.tmdbarhitect.data.database.TVDao
import com.example.tmdbarhitect.data.model.tv.ResultTV
import com.example.tmdbarhitect.data.repository.tv.datasource.TVLocalDatasource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class TVLocalDataSourceImpl(
   private val tvDao: TVDao
) : TVLocalDatasource {

   override suspend fun getTVFromDB(): List<ResultTV> {
      return tvDao.getTV()
   }

   override suspend fun saveTVToDB(tv: List<ResultTV>) {
      CoroutineScope(Dispatchers.IO).launch {
         tvDao.saveTV(tv)
      }
   }

   override suspend fun clearAll() {
      CoroutineScope(Dispatchers.IO).launch {
         tvDao.deleteAllTV()
      }
   }
}