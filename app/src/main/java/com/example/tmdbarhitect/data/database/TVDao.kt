package com.example.tmdbarhitect.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbarhitect.data.model.tv.ResultTV

/**
 * @author : Mingaleev D
 * @data : 10/11/2022
 */
@Dao
interface TVDao {

   @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun saveTV(tv: List<ResultTV>)

   @Query("DELETE FROM popular_tv")
   suspend fun deleteAllTV()

   @Query("SELECT * FROM popular_tv")
   suspend fun getTV():List<ResultTV>
}