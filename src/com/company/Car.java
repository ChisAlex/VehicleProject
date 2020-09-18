package com.company;

abstract class Car implements Vehicle{

    private int fuelTankSize;
    private String fuelType;
    private int gears;
    private double consumptionPer100Km;
    private int availableFuel;
    private int tireSize;
    private String chassisNumber;

    private double kilometers;

    protected Car(int fuelTankSize, String fuelType, int gears, double consumptionPer100Km, int availableFuel, int tireSize, String chassisNumber) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
        this.availableFuel = availableFuel;
        this.tireSize = tireSize;
        this.chassisNumber = chassisNumber;
        this.kilometers = 0;
    }

    private double getConsumption(){
        return (this.kilometers * this.consumptionPer100Km) / 100;
    }

    public void start(){
        System.out.println("Car has started: consumptionPer100km " + consumptionPer100Km);
    }

    public void stop() {
        double consumption = getConsumption();
        System.out.println("The consumption is: " + consumption + "l");
    }

    public void drive(int km){
        this.kilometers = this.kilometers + km;
        System.out.println("Drived: " + kilometers + "km");
    }

    public void shiftGear(int gear){
        if (gear <= gears && gear > 0){
        System.out.println("You are in gear: " + gear);
    }   else  {
            System.out.println("Nu poti introduce in aceasta viteza");}
    }


    public double getAvailableFuel(){
        double consumption = getConsumption();
        double availableFuel = this.availableFuel;
        return availableFuel - consumption;
    }

    public double getAverageFuelConsumption() {
        double initialAvailableFuel = this.availableFuel;
        double currentAvailableFuel = getAvailableFuel();
        double consumption = initialAvailableFuel - currentAvailableFuel;
        return consumption / kilometers;
    }

    public String toString() {
        return "This is the car";
    }

}


