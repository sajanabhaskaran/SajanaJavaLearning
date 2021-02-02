package com.myConsumer;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        Function<Specious,Animal> myFunction= specious -> {
            Animal polarBear= new Animal("Nalukali",4,false,specious);
            return polarBear;
        };

        Specious specious= new Specious("Sasthani","Artic");
        Animal polBear=myFunction.apply(specious);
        System.out.println(polBear.isOccupied());
    }
}
