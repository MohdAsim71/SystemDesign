package com.example.systemdesign.statePattern

 class ReadyState : VendingMachineState {
    override fun handleRequest() {
        println("Ready state: Please select a product.")
    }
}
