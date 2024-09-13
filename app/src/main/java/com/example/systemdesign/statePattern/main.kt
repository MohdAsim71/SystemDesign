package com.example.systemdesign.statePattern

fun main() {

    // Create context
    val vendingMachine = VendingMachineContext()


    // Set initial state
    vendingMachine.setState(ReadyState())


    // Request state change
    vendingMachine.request()


    // Change state
    vendingMachine.setState(ProductSelectedState())


    // Request state change
    vendingMachine.request()


    // Change state
    vendingMachine.setState(PaymentPendingState())


    // Request state change
    vendingMachine.request()


    // Change state
    vendingMachine.setState(OutOfStockState())


    // Request state change
    vendingMachine.request()
}