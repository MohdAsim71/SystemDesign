package com.example.systemdesign.mediator

// Mediator interface for the chat room
interface ChatRoomMediator {
    fun sendMessage(message: String, user: User)
}
