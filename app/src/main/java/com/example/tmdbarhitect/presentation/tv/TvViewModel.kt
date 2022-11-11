package com.example.tmdbarhitect.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbarhitect.domain.usercase.GetTVUseCase
import com.example.tmdbarhitect.domain.usercase.UpdateTVUseCase

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class TvViewModel(
   private val getTVUseCase: GetTVUseCase,
   private val updateTVUseCase: UpdateTVUseCase
) : ViewModel(){

   fun getTV() = liveData {
      val tvList = getTVUseCase.execute()
      emit(tvList)
   }

   fun updateTV() = liveData{
      val tvList = updateTVUseCase.execute()
      emit(tvList)
   }
}