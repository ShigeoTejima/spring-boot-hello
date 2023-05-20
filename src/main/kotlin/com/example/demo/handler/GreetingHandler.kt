package com.example.demo.handler

import com.example.demo.usecase.GreetingUsecase
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.*
import reactor.core.publisher.Mono
import javax.inject.Named

@Named
class GreetingHandler(private val greetingUsecase: GreetingUsecase) {

    fun hello(request: ServerRequest): Mono<ServerResponse> {
        val message = greetingUsecase.hello()
        return ServerResponse.ok()
            .body(BodyInserters.fromValue(message))
    }
}
