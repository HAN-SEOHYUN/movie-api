package com.proj.movieapi.utils.mapper

interface Mapper<D, E> {
    //eneity -> dto
    fun fromEntity(entity: E):D
    fun toEntiy(domain: D): E

}