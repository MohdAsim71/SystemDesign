package com.example.systemdesign.strategyPattern.strategy

class NormalDriveStrategy: DriveStrategy {
    override fun drive() {
        println("normal drive capability")
    }
}