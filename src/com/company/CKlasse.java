package com.company;

public class CKlasse extends Mercedes {
    public CKlasse (int availableFuel, String chassisNumber){
        super(54, "DIESEL", 6, 9, availableFuel, 19, chassisNumber);
    }
    public static void main(String[] args){

        Car cclass = new CKlasse(27, "7y6df");

        cclass.start();
        cclass.drive(654);
        cclass.stop();

        //double floatFuelConsumption = cclass.getAverageFuelConsumption();
        //System.out.println(floatFuelConsumption);

        //double floatAvailable = cclass.getAvailableFuel();
        //System.out.println(floatAvailable);

    }
}

