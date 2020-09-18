package com.company;

class Logan extends Dacia {

    public Logan(int availableFuel, String chassisNumber){
        super(18, "DIESEL", 5, 54, availableFuel, 16, chassisNumber);
    }

    public static void main(String[] args){

        Car log = new Logan(87, "AR99CDB");

        log.start();
        log.drive(100);
        log.stop();
        log.shiftGear(4);


        //double floatFuelConsumption = log.getAverageFuelConsumption();
        //System.out.println(floatFuelConsumption);

        //double floatAvailable = log.getAvailableFuel();
        //System.out.println(floatAvailable);

        //Vehicle veh = new Logan(454, "46hrh");
        //veh.start();

    }


}
