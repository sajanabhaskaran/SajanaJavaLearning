package com.myLambda1;

public class Helekopter implements AirVehicle {
    @Override
    public int flying(String vehicleType) {
        if (vehicleType.equals("hele")) return 1;
     return 0;
    }
    public void speedCheck(){
        System.out.println("speed checking");
    }
}
