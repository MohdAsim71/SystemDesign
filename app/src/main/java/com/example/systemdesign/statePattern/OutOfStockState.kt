package com.example.systemdesign.statePattern

 class OutOfStockState : VendingMachineState {
    override fun handleRequest() {
        println("Out of stock state: Product unavailable. Please select another product.")
    }
}