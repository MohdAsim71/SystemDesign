package com.example.systemdesign.mediator

// Concrete ChatRoom mediator
class ChatRoom : ChatRoomMediator {
    private val users = mutableListOf<User>()

    // Add users to the chat room
    fun addUser(user: User) {
        users.add(user)
    }

    // Send a message to all users except the sender
    override fun sendMessage(message: String, user: User) {
        for (u in users) {
            if (u != user) {
                u.receiveMessage(message)
            }
        }
    }
}
