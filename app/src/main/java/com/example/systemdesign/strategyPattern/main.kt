package com.example.systemdesign.strategyPattern

import com.example.systemdesign.strategyPattern.strategy.NormalDriveStrategy
import com.example.systemdesign.strategyPattern.strategy.OffRoadVehicleStrategy
import com.example.systemdesign.strategyPattern.strategy.PassengerVehicleStrategy
import com.example.systemdesign.strategyPattern.strategy.SportsDriveStrategy

fun main() {

        // Create a vehicle with an initial OffRoadVehicleStrategy
        val myVehicle = Vehicle(OffRoadVehicleStrategy())

        // Drive on-road
        myVehicle.drive() // Output: off road drive capability

        // Change the strategy to NormalDriveStrategy
        myVehicle.setDrivingStrategy(NormalDriveStrategy())
        myVehicle.drive() // Output: normal drive capability

        // Change the strategy to SportsDriveStrategy
        myVehicle.setDrivingStrategy(SportsDriveStrategy())
        myVehicle.drive() // Output: sports drive capability

        // Change the strategy to PassengerVehicleStrategy
        myVehicle.setDrivingStrategy(PassengerVehicleStrategy())
        myVehicle.drive() // Output: Passenger Vehicle drive capability
    }

