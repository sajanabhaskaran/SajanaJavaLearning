package com.myInterface1;

public class MainTest {
    public static void main(String[] args) {
        Vehicle BMW= new Car(4);
        Vehicle heroCycle= new ByCycle(2);
        VehicleTest test= new VehicleTest();
        test.test(BMW);
        test.test(heroCycle);
    }
}
