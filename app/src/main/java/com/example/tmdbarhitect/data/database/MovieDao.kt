package com.example.tmdbarhitect.data.database

import androidx.room.*
import com.example.tmdbarhitect.data.model.movie.ResultM

/**
 * @author : Mingaleev D
 * @data : 10/11/2022
 */

@Dao
interface MovieDao {

   @Insert(onConflict = OnConflictStrategy.REPLACE)
   suspend fun saveMovie(movie: List<ResultM>)

   @Query("DELETE FROM popular_movie")
   suspend fun deleteAllMovies()

   @Query("SELECT * FROM popular_movie")
   suspend fun getMovies(movie: List<ResultM>)
}