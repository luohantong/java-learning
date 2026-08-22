package com.lht.Day08;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("我是圆形");
    }
}
