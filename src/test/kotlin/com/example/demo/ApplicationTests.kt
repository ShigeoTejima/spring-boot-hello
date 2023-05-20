package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient
import org.springframework.test.web.reactive.server.expectBody

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests {

	@Autowired lateinit var client: WebTestClient

	@Test
	fun hello() {
		client.get().uri("/hello")
			.exchange()
			.expectStatus().isOk
			.expectBody<String>().isEqualTo("Hello!")
	}

}
