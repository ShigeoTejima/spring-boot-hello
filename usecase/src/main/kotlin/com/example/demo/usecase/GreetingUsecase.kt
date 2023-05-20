package com.example.demo.usecase

import javax.inject.Named

@Named
class GreetingUsecase {

    fun hello(): String {
        return "Hello!"
    }
}