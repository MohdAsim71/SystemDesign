package com.example.systemdesign.statePattern

 class PaymentPendingState : VendingMachineState {
    override fun handleRequest() {
        println("Payment pending state: Dispensing product.")
    }
}