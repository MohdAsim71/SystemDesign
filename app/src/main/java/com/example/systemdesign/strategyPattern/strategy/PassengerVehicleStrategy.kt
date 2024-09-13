package com.example.systemdesign.strategyPattern.strategy

class PassengerVehicleStrategy: DriveStrategy {
    override fun drive() {
        println("Passenger Vehicle drive capability")
    }


}