package com.proj.movieapi.repository

import com.proj.movieapi.entity.Movie
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository

interface MovieRepository: CrudRepository<Movie, Int>{
    //crudReposity 를 사용했기 때문에 생략 가능
    //fun createMovie(movieDTO: MovieDTO)
    //fun getMovie(id: Int)

    @Query("SELECT m FROM Movie as m")
    fun getAllMovies(): List<Movie>

}


