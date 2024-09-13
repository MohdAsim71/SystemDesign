package com.example.systemdesign.mediator

fun main() {
    // Create chat room (mediator)
    val chatRoom = ChatRoom()

    // Create users and add them to the chat room
    val user1 = ConcreteUser(chatRoom, "Alice")
    val user2 = ConcreteUser(chatRoom, "Bob")
    val user3 = ConcreteUser(chatRoom, "Charlie")

    chatRoom.addUser(user1)
    chatRoom.addUser(user2)
    chatRoom.addUser(user3)

    // Users send messages
    user1.sendMessage("Hello everyone!")  // Output: Bob and Charlie receive the message
    user2.sendMessage("Hey Alice!")       // Output: Alice and Charlie receive the message
    user3.sendMessage("Good morning!")    // Output: Alice and Bob receive the message
}
