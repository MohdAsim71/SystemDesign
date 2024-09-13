package com.example.systemdesign.dacorator

class Cheese(pizza: Pizza) : PizzaDecorator(pizza) {
    override fun getCost(): Double {
        return super.getCost() + 1.5
    }

    override fun getDescription(): String {
        return super.getDescription() + ", cheese"
    }
}