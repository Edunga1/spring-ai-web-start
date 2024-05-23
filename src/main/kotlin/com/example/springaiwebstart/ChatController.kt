package com.example.springaiwebstart

import org.springframework.ai.ollama.OllamaChatClient
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatController(
    private val client: OllamaChatClient,
) {
    @CrossOrigin(originPatterns = ["*"])
    @GetMapping("/chat")
    fun chat(q: String) = mapOf(
        "response" to client.call(q)
    )
}