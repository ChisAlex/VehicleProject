package com.company;

public class VWGolf extends VW {
    public VWGolf (int availableFuel, String chassisNumber){
        super(23, "DIESEL", 6, 4, availableFuel, 15, chassisNumber);
    }
    public static void main(String[] args){

        Car golf = new VWGolf(54, "65ht96576B");

        golf.start();
        golf.drive(45);
        golf.stop();

        //double floatFuelConsumption = golf.getAverageFuelConsumption();
        //System.out.println(floatFuelConsumption);

        //double floatAvailable = golf.getAvailableFuel();
        //System.out.println(floatAvailable);

    }
}

