package com.example.demo.usecase

import org.springframework.stereotype.Component

@Component
class GreetingUsecase {

    fun hello(): String {
        return "Hello!"
    }
}