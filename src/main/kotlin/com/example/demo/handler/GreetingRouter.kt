package com.example.demo.handler

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class GreetingRouter(private val handler: GreetingHandler) {
    @Bean
    fun router() = org.springframework.web.reactive.function.server.router {
        GET("/hello", handler::hello)
    }

}