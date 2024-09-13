package com.example.systemdesign.adapterPattern

class WeightMachineAdapter(private val analogWeightMachine: AnalogWeightMachine) : DigitalWeightMachine {
    override fun getWeightInKilograms(): Double {
        val weightInPounds = analogWeightMachine.getWeightInPounds()
        // Conversion factor from pounds to kilograms
        val poundsToKilograms = 0.453592
        return weightInPounds * poundsToKilograms
    }
}
