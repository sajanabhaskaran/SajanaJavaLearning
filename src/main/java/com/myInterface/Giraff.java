package com.myInterface;

public class Giraff implements Animal {

    @Override
    public void run() {
        System.out.println("Giraff is running");
    }

    @Override
    public void makeSound() {
        System.out.println("KOOOO KKOOOO");
    }
}
