package com.example.systemdesign.interpreter

// Terminal expression for a number
class Number(private val value: Int) : Expression {
    override fun interpret(): Int {
        return value
    }
}
