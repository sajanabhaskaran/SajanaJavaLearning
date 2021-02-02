package com.myConsumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {
    public static void main(String[] args) {

        Consumer<String> myConsumer = s -> {
            System.out.println(s);
        };

        Consumer<Vehicle> vehicleConsumer = vehicle -> {
            vehicle.setLanguage("Swedish");
            vehicle.setRegCountry("Sweden");
        };

        Vehicle marutiObj = new Vehicle(100l, "Maruti", 1000l);
        System.out.println(marutiObj.getKmDriven());
        vehicleConsumer.accept(marutiObj);
        System.out.println(marutiObj.getKmDriven());

        Vehicle altoObj = new Vehicle(200l, "Alto", 2356l);
        vehicleConsumer.accept(altoObj);

        Consumer<Animal> animalsConsumer = Animals -> {
            System.out.println(Animals.getLegs());
        };

        //Animal dog = new Animal("type",2,true,s)
        //animalsConsumer.accept(dog);


    }






    private static void testConsumer() {

    }
}
