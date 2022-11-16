package com.proj.movieapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class MovieApiApplication {

	@GetMapping
	fun helloworld() = "Hello world !"

}

fun main(args: Array<String>) {
	runApplication<MovieApiApplication>(*args)
}
