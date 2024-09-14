package com.example.systemdesign.builderPattern

class Vehicle(
    val engine: String?,
    val transmission: String?,
    val seats: Int?
) {
    override fun toString(): String {
        return "Vehicle(engine='$engine', transmission='$transmission', seats=$seats)"
    }
}
