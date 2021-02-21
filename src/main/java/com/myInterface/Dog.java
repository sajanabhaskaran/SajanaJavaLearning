package com.myInterface;

public class Dog implements Animal {

    @Override
    public void run() {
        System.out.println("dog is running");
    }

    @Override
    public void makeSound() {
        System.out.println("bow bow bow");
    }
}
