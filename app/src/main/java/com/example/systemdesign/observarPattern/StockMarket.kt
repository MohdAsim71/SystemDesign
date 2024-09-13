package com.example.systemDesign.observarPattern

class StockMarket : Subject {
    private val observers = mutableListOf<Observer>()
    var stockPrice: Double = 0.0
        set(value) {
            field = value
            notifyObservers()
        }

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update(stockPrice)
        }
    }
}
