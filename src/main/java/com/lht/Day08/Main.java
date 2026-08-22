package com.lht.Day08;

public class Main {

    public static void main(String[] args) {

        //抽象类数组：存放任意Shape子类对象
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);        //半径2的圆
        shapes[1] = new Rectangle(3,4);   //3*4矩形
        shapes[2] = new Circle(5);       //半径5的圆


        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println("图形面积=" + shape.area());
            System.out.println("------------------------");
        }
    }
}
