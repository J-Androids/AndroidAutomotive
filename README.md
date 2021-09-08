# Android Automotive application based on *[android.car](https://developer.android.com/reference/android/car/Car)* library

The purpose of this application is to monitorize and visually represent the in-vehicle hardware and sensor changes.

## Prerequisites

* **[Latest version of Android Studio](https://developer.android.com/studio)**
* **[Polestar 2 Emulator](https://www.polestar.com/us/developer/get-started/)**
* **[Java JDK](https://www.oracle.com/java/technologies/javase-jdk16-downloads.html)**

## Note

    Currently the application is designed and built only for Polestar 2 Emulator.
    In case of other AVD's the application won't work properly.
    
## Application details

The application is built around four main component.

* **Speedometer component**: 
It gives a secondary speedometer and also responsible for observing three in-vehicle sensor changes, which are the following:
  * Parking brake status (active/inactive)
  * Low fuel indicator
  * Current selected gear
  
* **Energy component**:
This component is responsible for every battery/energy based sensor and gives a graphical representation about their changes.
The above mentioned sensors are the following:
  * EV battery level (Wh) - the current charged status of the vehicle in percentage
  * Battery capacity (Wh) - the maximum battery capacity
  * Range remaining (m) - the maximum ranged that could be traveled with the current charged status
  * Odometer (km) - total traveled distance with the vehicle
  * EV instantaneous charge rate sensor (mW) - the current charging rate
  * Outside temperature (°C)
  
  If the vehicle is charging the Odometer sensor is being replaced with the EV instantaneous charge rate sensor
  
* **Vehicle info component**:
It shows every information about the vehicle such (ex: *build id*, *model*, *built year*) and also list every in-vehicle car sensor (ex: *Goldfish 3-axis Gyroscope*)

* **Benchmark component**:
This component basically is a mini CPU Benchmark application. 
It was developed to test the CPU performance in different situations (ex: during low battery usage, after software update)
  

## Used libraries and technologies

* **[android.car library](https://developer.android.com/reference/android/car/Car)**
* **[ibrahimsn98 speedometer library](https://github.com/ibrahimsn98/speedometer)**
* **[androidx.room library](https://developer.android.com/jetpack/androidx/releases/room)**
* **[kotlin coroutines](https://kotlinlang.org/docs/coroutines-overview.html)**
* **[android material design](https://material.io/develop/android)**

The application is built around the **[MVVM](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93viewmodel)** design principle.
 
