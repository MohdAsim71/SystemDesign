package com.example.systemdesign.interpreter

// Non-terminal expression for subtraction
class Subtract(private val left: Expression, private val right: Expression) : Expression {
    override fun interpret(): Int {
        return left.interpret() - right.interpret()
    }
}