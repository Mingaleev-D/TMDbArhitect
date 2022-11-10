package com.example.tmdbarhitect.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.tmdbarhitect.data.model.people.ResultP

/**
 * @author : Mingaleev D
 * @data : 10/11/2022
 */
@Dao
interface PeopleDao {

   @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun savePeople(people: List<ResultP>)

   @Query("DELETE FROM popular_people")
   suspend fun deleteAllPeople()

   @Query("SELECT * FROM popular_people")
   suspend fun getPeople(people: List<ResultP>)
}