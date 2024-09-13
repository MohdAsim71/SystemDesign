package com.example.systemdesign.mediator

// Abstract User class
abstract class User(protected val mediator: ChatRoomMediator, val name: String) {
    abstract fun sendMessage(message: String)
    abstract fun receiveMessage(message: String)
}
