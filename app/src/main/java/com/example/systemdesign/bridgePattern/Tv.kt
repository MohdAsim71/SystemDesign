package com.example.systemdesign.bridgePattern

class TV : Device {
    override fun turnOn() {
        println("TV is now ON")
    }

    override fun turnOff() {
        println("TV is now OFF")
    }

    override fun setVolume(volume: Int) {
        println("TV volume set to $volume")
    }
}