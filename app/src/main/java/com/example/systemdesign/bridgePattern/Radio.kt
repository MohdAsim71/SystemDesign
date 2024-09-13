package com.example.systemdesign.bridgePattern

class Radio : Device {
    override fun turnOn() {
        println("Radio is now ON")
    }

    override fun turnOff() {
        println("Radio is now OFF")
    }

    override fun setVolume(volume: Int) {
        println("Radio volume set to $volume")
    }
}