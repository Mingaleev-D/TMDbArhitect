package com.example.tmdbarhitect.presentation.movie

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbarhitect.domain.usercase.GetMovieUseCase
import com.example.tmdbarhitect.domain.usercase.UpdateMoviesUseCase

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class MovieViewModel(
   private val getMovieUseCase: GetMovieUseCase,
   private val updateMovieUseCase: UpdateMoviesUseCase
):ViewModel() {

   fun getMovie() = liveData {
      val movieList = getMovieUseCase.execute()
      emit(movieList)
   }

   fun updateMovie() = liveData{
      val movieList = updateMovieUseCase.execute()
      emit(movieList)
   }
}