package com.example.systemdesign.builderPattern

fun main() {
    // Create a Car Builder
    val carBuilder = CarBuilder()

    // Create a Director to construct the vehicle
    val director = Director(carBuilder)

    // Build an economy car
    val economyCar = director.constructEconomyCar()
    println(economyCar)

    // Build a luxury car
    val luxuryCar = director.constructLuxuryCar()
    println(luxuryCar)
}
