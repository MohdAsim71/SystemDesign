package com.example.systemdesign.statePattern

internal class PaymentPendingState : VendingMachineState {
    override fun handleRequest() {
        println("Payment pending state: Dispensing product.")
    }
}