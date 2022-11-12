package com.example.tmdbarhitect.domain.usercase

import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.domain.repository.MovieRepository

/**
 * @author : Mingaleev D
 * @data : 11/11/2022
 */

class UpdateMoviesUseCase(
   private val movieRepository: MovieRepository
) {
   suspend fun execute():List<ResultM>? = movieRepository.updateMovies()
}