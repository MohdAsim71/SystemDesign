package com.example.systemDesign.observarPattern

class Investor(private val name: String) : Observer {
    private var stockPrice: Double = 0.0

    override fun update(stockPrice: Double) {
        this.stockPrice = stockPrice
        display()
    }

    fun display() {
        println("Investor $name: Stock price updated to $stockPrice")
    }
}
