package com.example.demo.usecase

import jakarta.inject.Named

@Named
class GreetingUsecase {

    fun hello(): String {
        return "Hello!"
    }
}