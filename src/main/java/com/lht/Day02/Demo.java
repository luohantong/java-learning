package com.lht.Day02;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int kg = 0;
            while (true) {
                System.out.print("请输入你的体重(单位kg)：");
                if (sc.hasNextInt()) {
                    kg = sc.nextInt();
                    if (kg > 0) {
                        break;
                    } else {
                        System.out.println("体重必须大于0，请重新输入！");
                    }
                } else {
                    sc.next();
                    System.out.println("输入不是有效整数，请重新输入！");
                }
            }

            double m1 = 0;
            while (true) {
                System.out.print("请输入你的身高(单位m，例如1.75)：");
                if (sc.hasNextDouble()) {
                    m1 = sc.nextDouble();
                    if (m1 > 0) {
                        break;
                    } else {
                        System.out.println("身高必须大于0，请重新输入！");
                    }
                } else {
                    sc.next();
                    System.out.println("输入不是有效浮点数，请重新输入！");
                }
            }

            double bmi = kg / (m1 * m1);
            System.out.printf("你的BMI = %.2f%n", bmi);

            if (bmi < 18.5) {
                System.out.println("体重偏轻");
            } else if (bmi < 24) {
                System.out.println("体重正常");
            } else if (bmi < 28) {
                System.out.println("体重超重");
            } else {
                System.out.println("肥胖");
            }

        } finally {
            sc.close();
        }
    }
}