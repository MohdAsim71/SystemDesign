package com.example.systemdesign.statePattern

internal class VendingMachineContext {
    private var state: VendingMachineState? = null

    fun setState(state: VendingMachineState?) {
        this.state = state
    }

    fun request() {
        state!!.handleRequest()
    }
}