package com.proj.movieapi.service

import com.proj.movieapi.dto.MovieDTO
import com.proj.movieapi.repository.MovieRepository
import com.proj.movieapi.utils.mapper.MovieMapper
import org.springframework.stereotype.Service

//servie layer
@Service
class MovieServiceImpl(
    private val movieRepository: MovieRepository,
    private val movieMapper: MovieMapper
) : MovieService {
    override fun createMovie(movieDTO: MovieDTO) : MovieDTO {

        if(movieDTO.id != -1)
            throw IllegalArgumentException("Id nust be null or -1")

        val movie = movieMapper.toEntiy(movieDTO)
        movieRepository.save(movie)
        return movieMapper.fromEntity(movie)
    }
}