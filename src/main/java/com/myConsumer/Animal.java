package com.myConsumer;

public class Animal {
    private String type;
    private int legs;
    private boolean occupied;
    // Composition
    private Specious specious;

    public Animal(String type, int legs, boolean occupied, Specious specious) {
        this.type = type;
        this.legs = legs;
        this.occupied = occupied;
        this.specious = specious;
    }

    public Specious getSpecious() {
        return specious;
    }

    public void setSpecious(Specious specious) {
        this.specious = specious;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
