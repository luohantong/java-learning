package com.lht.Day03;

import java.util.Random;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        // 1.创建键盘输入对象，用来读取用户输入数字
        Scanner sc = new Scanner(System.in);
        // 2.创建随机数对象
        Random random = new Random();
        // random.nextInt(100) → 生成 0~99， +1 变成 1~100
        int answer = random.nextInt(100) + 1;

        System.out.println("====猜数字游戏====");
        System.out.println("已经生成1‑100数字，请开始猜！");

        // while(true) 无限循环，不知道用户要猜多少次
        while (true) {
            System.out.print("请输入你猜的数字：");
            if (!sc.hasNextInt()) {
                //读取掉错误输入的垃圾字符串，必须写，否则死循环
                String badInput = sc.next();
                System.out.printf("【输入错误】\"%s\"不是数字，请输入1‑100的整数！%n", badInput);
                continue; //回到循环开头，重新输入
            }
            //读取键盘输入的整数
            int guess = sc.nextInt();

            //校验数字范围
            if (guess < 1 || guess > 100) {
                System.out.println("数字需要在1~100范围内，请重新输入！");
                continue;
            }

            int flag; //定义标记变量，专门给switch用
            if (guess > answer) {
                flag = 1;   //猜大了标记1
            } else if (guess < answer) {
                flag = 2;   //猜小了标记2
            } else {
                flag = 3;   //猜对标记3
            }

            // switch 根据flag的值做分支判断
            switch (flag) {
                case 1:
                    System.out.println("猜大了！再试试");
                    break; //break跳出switch，回到while循环开头继续猜
                case 2:
                    System.out.println("猜小了！再试试");
                    break;
                case 3:
                    System.out.println("恭喜，猜对了！");
                    System.out.printf("正确数字就是：%d%n", answer);
                    sc.close();
                    return; // return 结束main整个方法，游戏直接终止
            }
        }
    }
}
