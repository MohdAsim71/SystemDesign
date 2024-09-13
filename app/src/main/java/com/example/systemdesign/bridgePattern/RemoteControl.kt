package com.example.systemdesign.bridgePattern

abstract class RemoteControl(protected val device: Device) {
    abstract fun turnOn()
    abstract fun turnOff()
    abstract fun setVolume(volume: Int)
}
