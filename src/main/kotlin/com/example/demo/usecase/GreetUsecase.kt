package com.example.demo.usecase

import org.springframework.stereotype.Component

@Component
class GreetUsecase {

    fun hello(): String {
        return "Hello!"
    }
}