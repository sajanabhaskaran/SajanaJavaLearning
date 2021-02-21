package com.collectionSaj;

import java.util.Comparator;

public class Train implements Comparator {
    private double speed;
    private String name;

    public Train(double speed, String name) {
        this.speed = speed;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Train{" +
                "speed=" + speed +
                ", name='" + name + '\'' +
                '}';
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return 1500;
    }

    @Override
    public int compare(Object o1, Object o2) {
        Train a1= (Train)o1;
        Train a2= (Train) o2;
        return a1.getName().compareTo(a2.getName());

    }
}
