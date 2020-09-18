package com.company;

public class Duster extends Dacia {
    public Duster (int availableFuel, String chassisNumber){
        super(40, "DIESEL", 5, 8, availableFuel, 18, chassisNumber);
    }
    public static void main(String[] args){

        Car duster = new Duster(30, "65ht99CDB");

        duster.start();
        duster.drive(456);
        duster.stop();
        duster.shiftGear(5);

        //double floatFuelConsumption = duster.getAverageFuelConsumption();
        //System.out.println(floatFuelConsumption);

        //double floatAvailable = duster.getAvailableFuel();
        //System.out.println(floatAvailable);

    }
}
