package com.company;

public class VWPassat extends VW {

    public VWPassat (int availableFuel, String chassisNumber){
        super(48, "GAS", 6, 6, availableFuel, 20, chassisNumber);
    }
    public static void main(String[] args){

        Car passat = new VWPassat(45, "645fg");

        passat.start();
        passat.drive(73);
        passat.stop();

        //double floatFuelConsumption = passat.getAverageFuelConsumption();
        //System.out.println(floatFuelConsumption);

        //double floatAvailable = passat.getAvailableFuel();
        //System.out.println(floatAvailable);

    }
}

