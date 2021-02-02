package com.myConsumer;

import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {

        Supplier<Vehicle> vehicleSupplier = () -> {
            Vehicle vehicle = new Vehicle(123l, "BMW", 1234l);
            return vehicle;

        };
        Vehicle v1 = vehicleSupplier.get();
        System.out.println(v1.getModel());

    }


}
