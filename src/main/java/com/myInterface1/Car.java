package com.myInterface1;

public class Car implements Vehicle{
    private Integer tires;

    public Car(Integer tires){
        this.tires=tires;
    }
    @Override
    public void honk() {
        System.out.println("Pom Pom");
    }

    @Override
    public Integer numberOfTires() {
        return this.tires;
    }
}
