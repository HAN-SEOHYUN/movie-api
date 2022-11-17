package com.proj.movieapi.service

import com.proj.movieapi.dto.MovieDTO
import com.proj.movieapi.repository.MovieRepository

interface MovieService {
    fun createMovie(movieDTO: MovieDTO) : MovieDTO

    fun getMovies(): List<MovieDTO>

    fun getMovie(id: Int): MovieDTO

    fun updateMovie(movieDTO: MovieDTO) : MovieDTO

    fun deleteMovie(id: Int)
}