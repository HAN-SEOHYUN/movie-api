package com.proj.movieapi.web.rest

import com.proj.movieapi.dto.MovieDTO
import com.proj.movieapi.service.MovieService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieResource(
    private val movieService: MovieService
) {
    @PostMapping
    fun createMovie(movieDTO: MovieDTO): MovieDTO{
        return movieService.createMovie(movieDTO)
    }
}