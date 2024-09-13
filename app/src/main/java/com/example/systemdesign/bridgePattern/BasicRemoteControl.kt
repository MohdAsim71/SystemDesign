package com.example.systemdesign.bridgePattern

class BasicRemoteControl(device: Device) : RemoteControl(device) {
    override fun turnOn() {
        device.turnOn()
    }

    override fun turnOff() {
        device.turnOff()
    }

    override fun setVolume(volume: Int) {
        device.setVolume(volume)
    }
}
