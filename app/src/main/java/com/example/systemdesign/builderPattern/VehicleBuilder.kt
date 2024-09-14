package com.example.systemdesign.builderPattern

interface VehicleBuilder {
    fun setEngine(engine: String): VehicleBuilder
    fun setTransmission(transmission: String): VehicleBuilder
    fun setSeats(seats: Int): VehicleBuilder
    fun build(): Vehicle
}
