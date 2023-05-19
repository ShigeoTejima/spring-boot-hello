package com.example.demo.handler

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration
class GreetingRouter {

    @Bean
    fun route(greetHandler: GreetingHandler): RouterFunction<ServerResponse> {
        return RouterFunctions
            .route(GET("/hello"), greetHandler::hello)
    }
}