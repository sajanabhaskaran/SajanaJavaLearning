package com.inheritance1;

public class Cars {

    int speed;// no access modifier means accessible in the same package
    private int privateSpeed;// only on classes

    public int getPrivateSpeed() {
        return privateSpeed;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "speed=" + speed +
                ", privateSpeed=" + privateSpeed +
                '}';
    }

    public void setPrivateSpeed(int privateSpeed) {
        this.privateSpeed = privateSpeed;
    }

    public Cars(int speed) {
        this.speed = speed;
    }
    public void increaseSpeed(){
        speed++;
        System.out.println("Cars speed increased to " +speed );
    }
    public void decreseSpeed(){
        speed--;
        System.out.println("Cars speed is decreased to "+speed);
    }
}
