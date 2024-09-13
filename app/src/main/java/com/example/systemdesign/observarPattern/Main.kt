package com.example.systemDesign.observarPattern

fun main() {


    /*
    * The Observer Design Pattern is a behavioral design pattern that defines a one-to-many dependency between objects so that when one object changes state, all its dependents (observers) are notified and updated automatically.

Here's an example of the Observer pattern in Kotlin using a simple example of a stock market ticker:

Subject (Observable): This is the class that maintains a list of observers and notifies them of any state changes.

Observer: This is an interface that is implemented by all concrete observers. They will be notified by the subject of any state changes.

ConcreteSubject: This is the class that extends the subject and changes its state. It also notifies all observers about the state change.

ConcreteObserver: This is the class that implements the observer interface and updates its state based on the subject's state changes.
    * */

    // Create the subject
    val stockMarket = StockMarket()

    // Create observers
    val investor1 = Investor("Alice")
    val investor2 = Investor("Bob")

    // Register observers with the subject
    stockMarket.registerObserver(investor1)
    stockMarket.registerObserver(investor2)

    // Change the state of the subject
    stockMarket.stockPrice = 100.0
    stockMarket.stockPrice = 200.0

    // Remove an observer
    stockMarket.removeObserver(investor1)

    // Change the state of the subject
    stockMarket.stockPrice = 300.0
}
