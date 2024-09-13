package com.example.systemdesign.strategyPattern
import com.example.systemdesign.strategyPattern.strategy.DriveStrategy

class Vehicle(private var drivingStrategy: DriveStrategy) {

    // Method to set or change the driving strategy at runtime
    fun setDrivingStrategy(newStrategy: DriveStrategy) {
        drivingStrategy = newStrategy
    }

    // Method to perform driving based on the current strategy
    fun drive() {
        drivingStrategy.drive()
    }
}
