package com.proj.movieapi.dto

data class MovieDTO(
    //give them a default value
    var id: Int = -1,
    var name: String = "Default movie",
    var rating: Double
)
