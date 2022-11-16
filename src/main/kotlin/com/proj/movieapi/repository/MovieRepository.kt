package com.proj.movieapi.repository

import com.proj.movieapi.dto.MovieDTO
import com.proj.movieapi.entity.Movie
import org.springframework.data.repository.CrudRepository

interface MovieRepository: CrudRepository<Movie, Int> {
    //crudReposity 를 사용했기 때문에 생략 가능
    //fun createMovie(movieDTO: MovieDTO)
    //fun getMovie(id: Int)
}