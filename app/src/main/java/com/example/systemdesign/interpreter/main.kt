package com.example.systemdesign.interpreter

fun main() {
    // Create number expressions
    val five = Number(5)
    val ten = Number(10)
    val three = Number(3)

    // Create an addition expression: (5 + 10)
    val addition = Add(five, ten)
    println("addition: ${addition.interpret()}")
    // Create a subtraction expression: (5 + 10) - 3
    val subtraction = Subtract(addition, three)
    println("subtraction: ${subtraction.interpret()}")

    // Interpret the expression and print the result
    val result = subtraction.interpret()
    println("Result: $result")  // Output: Result: 12
}
