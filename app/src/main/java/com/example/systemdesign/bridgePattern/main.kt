package com.example.systemdesign.bridgePattern

fun main() {
    // Create devices
    val tv = TV()
    val radio = Radio()

    // Create remote controls
    val tvRemote = BasicRemoteControl(tv)
    val radioRemote = BasicRemoteControl(radio)

    // Control TV
    tvRemote.turnOn()        // Output: TV is now ON
    tvRemote.setVolume(15)   // Output: TV volume set to 15
    tvRemote.turnOff()       // Output: TV is now OFF

    // Control Radio
    radioRemote.turnOn()     // Output: Radio is now ON
    radioRemote.setVolume(5) // Output: Radio volume set to 5
    radioRemote.turnOff()    // Output: Radio is now OFF
}
