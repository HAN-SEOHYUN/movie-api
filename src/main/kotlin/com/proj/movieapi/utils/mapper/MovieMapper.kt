package com.proj.movieapi.utils.mapper

import com.proj.movieapi.dto.MovieDTO
import com.proj.movieapi.entity.Movie
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class MovieMapper : Mapper<MovieDTO, Movie> {

    //entity to dto
    override fun fromEntity(entity: Movie): MovieDTO = MovieDTO(
        entity.id,
        entity.name,
        entity.rating
    )

    //dto to enity
    override fun toEntiy(domain: MovieDTO): Movie = Movie(
        domain.id,
        domain.name,
        domain.rating
    )
}