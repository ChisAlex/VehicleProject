package com.company;

public class SKlasse extends Mercedes{
    public SKlasse (int availableFuel, String chassisNumber){
        super(70, "DIESEL", 6, 14, availableFuel, 21, chassisNumber);
    }
    public static void main(String[] args){

        Car sclass = new SKlasse(37, "23gt6y");

        sclass.start();
        sclass.drive(435);
        sclass.stop();

        //double floatFuelConsumption = sclass.getAverageFuelConsumption();
        //System.out.println(floatFuelConsumption);

        //double floatAvailable = sclass.getAvailableFuel();
        //System.out.println(floatAvailable);

    }
}
