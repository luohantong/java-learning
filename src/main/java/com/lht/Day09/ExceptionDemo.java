package com.lht.Day09;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {


        System.out.println("====场景1：除零异常演示====");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("捕获异常：发生除零错误！");
        } finally {
            System.out.println("场景1 finally：程序结束");
        }


        System.out.println("\n====场景2：数组下标越界演示====");
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[5]); //数组只有0,1,2下标，访问5越界
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获异常：数组下标越界！");
        } finally {
            System.out.println("场景2 finally：程序结束");
        }

        System.out.println("\n====场景3：用户输入除法，循环容错====");
        Scanner sc = new Scanner(System.in);
        try{
            while(true){
                System.out.print("\n请输入第一个数字：");
                if(!sc.hasNextInt()){
                    sc.next(); //吃掉脏数据
                    System.out.println("❌请输入数字！");
                    continue;
                }
                int num1 = sc.nextInt();

                System.out.print("请输入第二个数字：");
                if(!sc.hasNextInt()){
                    sc.next();
                    System.out.println("❌请输入数字！");
                    continue;
                }
                int num2 = sc.nextInt();

                try {
                    int res = num1 / num2;
                    System.out.println("计算结果：" + num1 + " / " + num2 + " = " + res);
                    System.out.println("继续计算？(y/n)：");
                    if (sc.next().equalsIgnoreCase("n")){
                        break;
                    }
                }catch (ArithmeticException e){
                    System.out.println("❌不能除以0，请重新输入！");
                }
            }
        }finally {
            System.out.println("\n✅【finally执行】无论有没有异常，这段代码一定会跑");
            sc.close();
        }
    }
}
