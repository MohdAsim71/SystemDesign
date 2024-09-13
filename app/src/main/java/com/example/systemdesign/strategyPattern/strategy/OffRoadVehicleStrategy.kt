package com.example.systemdesign.strategyPattern.strategy

class OffRoadVehicleStrategy: DriveStrategy {
    override fun drive(){
        println("off road drive capability")
    }
}