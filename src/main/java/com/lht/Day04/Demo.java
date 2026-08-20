package com.lht.Day04;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.定义数组，存放5个学生成绩
        int[] scores = new int[5];
        // 循环输入成绩
        for (int i = 0; i < scores.length;) {
            System.out.print("请输入第" + (i+1) + "个学生成绩：");
            if (sc.hasNextInt()) {
                scores[i] = sc.nextInt();
                i++;
            }  else {
                sc.next();
                System.out.println("输入不是有效数字，请重新输入！");
            }
        }
        // 2.求最高分、最低分、总和
        int max = scores[0];   // 假设第一个元素是最高分
        int min = scores[0];   // 假设第一个元素是最低分
        int sum = 0;
        // 循环遍历数组，求最高分、最低分、总和
        for (int score : scores) {
            if (score > max) {
                max = score;   // 更新最高分
            } else if (score < min) {
                min = score;   // 更新最低分
            }
            sum += score;
        }
        // 3.计算平均分
        double avg = (double) sum / scores.length;
        System.out.println("最高分是：" + max);
        System.out.println("最低分是：" + min);
        System.out.println("总和是：" + sum);
        System.out.println("平均分是：" + avg);
        sc.close();
    }
}
