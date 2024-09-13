package com.example.systemdesign.factoryPattern

import com.example.systemDesign.FactoryPattern.ShapeFactory


/**/
/*
Factory pattern:-
1:-Factory pattern is one of the most used design patterns in Java.This type of design pattern comes under creational pattern as
this pattern provides one of the best ways to create an object.
2:-The Factory Design Pattern is a creational pattern that provides an interface for creating objects in a superclass,
 but allows subclasses to alter the type of objects that will be created.
3:-Instead of instantiating objects directly using the new keyword, the pattern recommends creating objects through a common interface or abstract class.

Why :- if we have to create object and we have big code repo and my be have to initiate same object on the bases of
some condition then there must be duplicacy. So we use factory pattern which hold and manage the object and we can call factory class to make object.
* */
fun main() {
    val shapeFactory = ShapeFactory()

    // Get an object of Circle and call its draw method
    val shape1 = shapeFactory.getShape("Circle")
    shape1?.draw()

    // Get an object of Rectangle and call its draw method
    val shape2 = shapeFactory.getShape("Rectangle")
    shape2?.draw()
}
