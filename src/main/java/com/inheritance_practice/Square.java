package com.inheritance_practice;

public class Square extends Shape {
    private double squareCost;

    public Square(double length, double breadth, double squareCost) {
        super(length, breadth);
        this.squareCost = squareCost;
    }

    @Override
    public double computeCost() {
        double area = super.area();
        double sqrCost = area * (super.getBaseCost() + this.squareCost);
        return sqrCost;
    }
}
