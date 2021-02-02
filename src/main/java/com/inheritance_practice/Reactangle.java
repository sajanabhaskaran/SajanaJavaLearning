package com.inheritance_practice;

public class Reactangle extends Shape {
    private double rectangleCost;

    public Reactangle(double length, double breadth, double rectangleCost) {
        super(length, breadth);
        this.rectangleCost = rectangleCost;
    }

    @Override
    public double computeCost() {
        double area = super.area();

        double finalCost = area * (super.getBaseCost() + this.rectangleCost);
        return finalCost;
    }

    /*@Override
    public double computeCost() {
        double initialCost=super.computeCost(area);
        double finalCost= initialCost*this.rectangleCost;
        return finalCost;
    }*/
}

