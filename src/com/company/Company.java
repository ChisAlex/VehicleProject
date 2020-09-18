package com.company;

abstract class Dacia extends Car {

    public Dacia(int fuelTankSize, String fuelType, int gears, double consumptionPer100Km, int availableFuel, int tireSize, String chassisNumber) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km, availableFuel, tireSize, chassisNumber);
    }
}

abstract class Mercedes extends Car {

    public Mercedes(int fuelTankSize, String fuelType, int gears, double consumptionPer100Km, int availableFuel, int tireSize, String chassisNumber) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km, availableFuel, tireSize, chassisNumber);
    }
}

abstract class VW extends Car {

    public VW(int fuelTankSize, String fuelType, int gears, double consumptionPer100Km, int availableFuel, int tireSize, String chassisNumber) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km, availableFuel, tireSize, chassisNumber);
    }

}