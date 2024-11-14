package com.jacknie.sample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping

@SpringBootApplication
class SpringWebSampleApplication

fun main(args: Array<String>) {
	runApplication<SpringWebSampleApplication>(*args)
}

@Controller
class HomeController {

	@GetMapping("/")
	fun home() = "home"
}