package com.myInterface1;

public class ByCycle implements Vehicle{
    private Integer tires;
    public ByCycle(Integer tires){
        this.tires=tires;
    }
    @Override
    public void honk() {
        System.out.println("Kini Kini");
    }

    @Override
    public Integer numberOfTires() {
        return this.tires;

    }
}
