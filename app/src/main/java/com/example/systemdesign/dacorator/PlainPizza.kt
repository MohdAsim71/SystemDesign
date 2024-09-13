package com.example.systemdesign.dacorator

class PlainPizza : Pizza {
    override fun getCost(): Double {
        return 8.0
    }

    override fun getDescription(): String {
        return "Plain pizza"
    }
}
