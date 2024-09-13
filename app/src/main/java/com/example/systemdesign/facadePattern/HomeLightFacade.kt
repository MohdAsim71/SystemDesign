package com.example.systemdesign.facadePattern

class HomeLightFacade(
    private val livingRoomLight: LivingRoomLight,
    private val kitchenLight: KitchenLight,
    private val bedroomLight: BedroomLight
) {
    fun turnOnAllLights() {
        livingRoomLight.on()
        kitchenLight.on()
        bedroomLight.on()
    }

    fun turnOffAllLights() {
        livingRoomLight.off()
        kitchenLight.off()
        bedroomLight.off()
    }
}
