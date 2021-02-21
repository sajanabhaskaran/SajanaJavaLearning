package com.myLambda;

public class CycleMain {
    public static void main(String[] args) {
        //Object Oriented way of calling Interface method
        Cycling mountainCycling= new MountainCycling();
        perform(mountainCycling);

        //Anonymous Inner Class
        Cycling desertCycling= new Cycling() {
            @Override
            public int getSpeedLimit(String gearType) {
                if (gearType.equals("WithGear")) return 10;
                return 5;
            }
        };
        perform(desertCycling);
        //desertCycling.getSpeedLimit("WithGear");

        //Lambda Expression
       Cycling riverLambda=   ( gearType) -> {
            if (gearType.equals("WithGear")) return 3;
            return 1;
        };
       perform(riverLambda);
       //riverLambda.getSpeedLimit("WithGear");


        Cycling skyCycling= gearType -> {
            if (gearType.equals("WithGear")) return 100;
            return 50;
        };
        System.out.println(skyCycling.getSpeedLimit("WithGear"));
        perform(skyCycling);
        




    }


    static void perform(Cycling c){

        System.out.println("Speed Limit: " +c.getSpeedLimit("WithGear"));
    }
}
