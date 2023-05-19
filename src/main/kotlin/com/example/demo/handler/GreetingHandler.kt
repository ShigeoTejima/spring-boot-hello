package com.example.demo.handler

import com.example.demo.usecase.GreetingUsecase
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class GreetingHandler(private val greetingUsecase: GreetingUsecase) {

    @GetMapping("hello")
    fun hello(request: ServerRequest): Mono<ServerResponse> {
        val message = greetingUsecase.hello()
        return ServerResponse.ok()
            .body(BodyInserters.fromValue(message))
    }
}