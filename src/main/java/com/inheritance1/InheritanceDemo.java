package com.inheritance1;

public class InheritanceDemo {
    public static void main(String[] args) {
        int speed=10;

        Cars C1=new Cars(speed);
        C1.increaseSpeed();
        C1.decreseSpeed();
        C1.setPrivateSpeed(12);
        System.out.println(C1.getPrivateSpeed());
        BMW myBMW= new BMW(speed);
        myBMW.increaseSpeed();
        myBMW.navigate();
        System.out.println(C1.toString());


    }
}
