package com.example.demo.controller

import com.example.demo.usecase.GreetUsecase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("greet")
class GreetController(
    private val greetUsecase: GreetUsecase
) {

    @GetMapping("hello")
    fun hello(): String {
        return greetUsecase.hello()
    }
}