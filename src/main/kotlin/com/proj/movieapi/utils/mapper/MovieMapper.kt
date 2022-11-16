package com.proj.movieapi.utils.mapper

import com.proj.movieapi.MovieDTO
import com.proj.movieapi.entity.Movie

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