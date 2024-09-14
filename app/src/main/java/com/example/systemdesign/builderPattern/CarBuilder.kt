package com.example.systemdesign.builderPattern

class CarBuilder : VehicleBuilder {
    private var engine: String? = null
    private var transmission: String? = null
    private var seats: Int? = null

    override fun setEngine(engine: String): VehicleBuilder {
        this.engine = engine
        return this
    }

    override fun setTransmission(transmission: String): VehicleBuilder {
        this.transmission = transmission
        return this
    }

    override fun setSeats(seats: Int): VehicleBuilder {
        this.seats = seats
        return this
    }

    override fun build(): Vehicle {
        return Vehicle(engine, transmission, seats)
    }
}
