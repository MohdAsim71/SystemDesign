package com.example.systemdesign.statePattern

 class ProductSelectedState : VendingMachineState {
    override fun handleRequest() {
        println("Product selected state: Processing payment.")
    }
}