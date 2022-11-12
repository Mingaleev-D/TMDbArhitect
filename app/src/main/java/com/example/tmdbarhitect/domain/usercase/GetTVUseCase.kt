package com.example.tmdbarhitect.domain.usercase

import com.example.tmdbarhitect.data.model.tv.ResultTV
import com.example.tmdbarhitect.domain.repository.TVRepository

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class GetTVUseCase(
   private val tvRepository: TVRepository
) {
   suspend fun execute():List<ResultTV>? = tvRepository.getTV()
}