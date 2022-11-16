package com.proj.movieapi.service

import com.proj.movieapi.dto.MovieDTO

interface MovieService {
    fun createMovie(movieDTO: MovieDTO) : MovieDTO
}