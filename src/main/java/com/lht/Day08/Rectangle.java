package com.lht.Day08;

public class Rectangle extends Shape {

    private double length;

    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void printInfo() {
        System.out.println("我是长方形");
    }
}
