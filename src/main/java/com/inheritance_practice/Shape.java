package com.inheritance_practice;

public abstract class Shape {
    private double length;
    private double breadth;
    private double baseCost = 10;

    public Shape() {
    }

    public double getBaseCost() {

        return baseCost;
    }

    public Shape(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    public double area() {
        double area = this.length * this.breadth;/**/
        return area;
    }
    /*public double computeCost(double area){
        double cost=this.baseCost*area;
        //return cost;
        return cost;
    }*/

    public abstract double computeCost();

}
