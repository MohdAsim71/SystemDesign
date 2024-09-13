package com.example.systemdesign.mediator

// Concrete User class
class ConcreteUser(mediator: ChatRoomMediator, name: String) : User(mediator, name) {

    override fun sendMessage(message: String) {
        println("$name sends message: $message")
        mediator.sendMessage(message, this)
    }

    override fun receiveMessage(message: String) {
        println("$name received message: $message")
    }
}
