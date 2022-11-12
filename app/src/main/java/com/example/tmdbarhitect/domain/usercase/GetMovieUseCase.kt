package com.example.tmdbarhitect.domain.usercase

import com.example.tmdbarhitect.data.model.movie.ResultM
import com.example.tmdbarhitect.domain.repository.MovieRepository

/**
 * @author : Mingaleev D
 * @data : 10/11/2022
 */

class GetMovieUseCase(
   private val movieRepository: MovieRepository
) {
   suspend fun execute():List<ResultM>? = movieRepository.getMovies()
}