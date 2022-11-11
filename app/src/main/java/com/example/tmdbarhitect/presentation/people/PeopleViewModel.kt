package com.example.tmdbarhitect.presentation.people

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbarhitect.domain.usercase.GetPeopleUseCase
import com.example.tmdbarhitect.domain.usercase.UpdatePeopleUseCase

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class PeopleViewModel(
   private val getPeopleUseCase: GetPeopleUseCase,
   private val updatePeopleUseCase: UpdatePeopleUseCase
) :ViewModel(){

   fun getPeople() = liveData {
      val peopleList = getPeopleUseCase.execute()
      emit(peopleList)
   }

   fun updatePeople() = liveData{
      val peopleList = updatePeopleUseCase.execute()
      emit(peopleList)
   }
}