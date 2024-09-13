package com.example.systemdesign.dacorator

fun main() {
    // Create a plain pizza
    var pizza: Pizza = PlainPizza()

    // Add cheese to the pizza
    pizza = Cheese(pizza)

    // Add pepperoni to the pizza
    pizza = Pepperoni(pizza)

    // Add olives to the pizza
    pizza = Olives(pizza)

    // Display the cost and description
    println("Cost: ${pizza.getCost()}") // Output: Cost: 12.5
    println("Description: ${pizza.getDescription()}") // Output: Description: Plain pizza, cheese, pepperoni, olives
}
