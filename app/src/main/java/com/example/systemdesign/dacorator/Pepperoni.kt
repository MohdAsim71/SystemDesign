package com.example.systemdesign.dacorator

class Pepperoni(pizza: Pizza) : PizzaDecorator(pizza) {
    override fun getCost(): Double {
        return super.getCost() + 2.0
    }

    override fun getDescription(): String {
        return super.getDescription() + ", pepperoni"
    }
}