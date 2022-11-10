package com.example.tmdbarhitect.domain.usercase

import com.example.tmdbarhitect.data.model.people.ResultP
import com.example.tmdbarhitect.domain.repository.PeopleRepository

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class UpdatePeopleUseCase(
   private val peopleRepository: PeopleRepository
) {
   suspend fun execute():List<ResultP>? = peopleRepository.updatePeoples()
}