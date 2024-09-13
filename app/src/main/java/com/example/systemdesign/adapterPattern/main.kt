package com.example.systemdesign.adapterPattern

fun main() {
    // Create an instance of the analog weight machine
    val analogMachine = AnalogWeightMachine()

    // Create an adapter for the analog weight machine
    val adapter = WeightMachineAdapter(analogMachine)

    // Get the weight in kilograms using the adapter
    val weightInKilograms = adapter.getWeightInKilograms()
    println("Weight in kilograms: $weightInKilograms")  // Output: Weight in kilograms: 68.1818
}
