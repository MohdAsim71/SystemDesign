package com.example.systemDesign.FactoryPattern

class ShapeFactory {
    fun getShape(shapeType: String): Shape? {
        return when (shapeType.toLowerCase()) {
            "circle" -> Circle()
            "rectangle" -> Rectangle()
            else -> null
        }
    }
}

