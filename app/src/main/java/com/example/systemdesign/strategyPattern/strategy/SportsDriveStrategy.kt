package com.example.systemdesign.strategyPattern.strategy

class SportsDriveStrategy: DriveStrategy {
    override fun drive() {
        println("sports drive capability")
    }
}