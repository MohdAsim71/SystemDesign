package com.example.systemdesign.dacorator

class Olives(pizza: Pizza) : PizzaDecorator(pizza) {
    override fun getCost(): Double {
        return super.getCost() + 1.0
    }

    override fun getDescription(): String {
        return super.getDescription() + ", olives"
    }
}