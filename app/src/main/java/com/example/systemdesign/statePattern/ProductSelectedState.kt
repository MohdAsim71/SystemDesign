package com.example.systemdesign.statePattern

internal class ProductSelectedState : VendingMachineState {
    override fun handleRequest() {
        println("Product selected state: Processing payment.")
    }
}