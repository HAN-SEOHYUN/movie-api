package com.proj.movieapi.service

import com.proj.movieapi.dto.MovieDTO
import com.proj.movieapi.repository.MovieRepository
import com.proj.movieapi.utils.exceptions.MovieException
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
            throw MovieException("Id must be null or -1")

        val movie = movieRepository.save(movieMapper.toEntiy(movieDTO))
        return movieMapper.fromEntity(movie)
    }

    override fun getMovies(): List<MovieDTO> {
        val movies = movieRepository.getAllMovies()

        if(movies.isEmpty())
            throw MovieException("List of movies is empty.")

        return movies.map{
            movieMapper.fromEntity(it)
        }
    }
    override fun getMovie(id: Int): MovieDTO {
        val optionalMovie = movieRepository.findById(id)
        val movie = optionalMovie.orElseThrow{MovieException("Movie with id $id is not present") }
        return movieMapper.fromEntity(movie)
    }
}