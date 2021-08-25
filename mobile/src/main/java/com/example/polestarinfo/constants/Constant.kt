package com.example.polestarinfo.constants

import android.car.Car

object Constant {
    val permissions = arrayOf(
        Car.PERMISSION_SPEED,
        Car.PERMISSION_ENERGY,
        Car.PERMISSION_POWERTRAIN,
        Car.PERMISSION_CAR_INFO,
        Car.PERMISSION_EXTERIOR_ENVIRONMENT,
        Car.PERMISSION_ENERGY_PORTS
    )

    val gearList = mapOf(
        1 to "N (Neutral)",
        2 to "R (Reverse)",
        4 to "P (Park)",
        8 to "D (Drive)",
        16 to "First Gear",
        64 to "Third Gear",
        128 to "Fourth Gear",
        256 to "Fifth Gear",
        512 to "Sixth Gear",
        1024 to "Seventh Gear",
        2048 to "Eighth Gear",
        4096 to "Ninth Gear"
    )

    val fuelList = mapOf(
        0 to "Unknown",
        1 to "Unleaded",
        2 to "Leaded gasoline",
        3 to "1 Grade Diesel",
        4 to "2 Grade Diesel",
        5 to "Biodiesel",
        6 to "E85",
        7 to "LPG",
        8 to "CNG",
        9 to "LNG",
        10 to "Electric",
        11 to "Hydrogen",
        12 to "Other"
    )

    const val KM_MULTIPLIER = 3.59999987F
    const val MAX_WH = 150000.000F
    const val WH_TO_KWH = 1000
    const val M_TO_MI = 1609.344F
    const val MW_TO_KW = 1000
    const val ODOMETER = "Odometer"
    const val CHARGE = "Charge rate"
    const val ODOMETER_DEFAULT_VAL = "5000 km"
}