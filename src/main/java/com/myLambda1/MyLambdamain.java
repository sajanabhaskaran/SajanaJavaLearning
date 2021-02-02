package com.myLambda1;

public class MyLambdamain {
    public static void main(String[] args) {
        MyLambdamain myLambdamain =new MyLambdamain();

        AirVehicle hel= new Helekopter();
        myLambdamain.demo(hel);

        AirVehicle boe=new Boeing();
        myLambdamain.demo(boe);

    }
    private void demo(AirVehicle s){
        System.out.println("demo private method");
        s.flying("jet");

    }
}
