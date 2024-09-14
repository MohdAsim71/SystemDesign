package com.example.systemdesign.builderPattern

class Director(private val builder: VehicleBuilder) {
    fun constructEconomyCar(): Vehicle {
        return builder.setEngine("1.2L")
            .setTransmission("Manual")
            .setSeats(4)
            .build()
    }

    fun constructLuxuryCar(): Vehicle {
        return builder.setEngine("3.0L V6")
            .setTransmission("Automatic")
            .setSeats(5)
            .build()
    }
}
