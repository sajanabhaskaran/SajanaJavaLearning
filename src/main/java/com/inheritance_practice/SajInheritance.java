package com.inheritance_practice;

public class SajInheritance {
    public static void main(String[] args) {
        Shape rectShape = new Reactangle(10, 12, 20);
        //double rectArea= rectShape.area();
        double rectangleCost = rectShape.computeCost();
        System.out.println("Rectangle cost: " + rectangleCost);
        Shape squareShape = new Square(2, 2, 30);
        //double squareArea=squareShape.area();
        double squareCost = squareShape.computeCost();
        System.out.println("Square Cost: " + squareCost);


    }
}
