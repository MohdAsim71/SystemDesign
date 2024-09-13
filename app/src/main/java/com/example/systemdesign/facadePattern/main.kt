package com.example.systemdesign.facadePattern

fun main() {
    // Create the subsystem objects
    val livingRoomLight = LivingRoomLight()
    val kitchenLight = KitchenLight()
    val bedroomLight = BedroomLight()

    // Create the facade
    val homeLightFacade = HomeLightFacade(livingRoomLight, kitchenLight, bedroomLight)

    // Turn all lights ON
    homeLightFacade.turnOnAllLights()

    // Turn all lights OFF
    homeLightFacade.turnOffAllLights()
}
