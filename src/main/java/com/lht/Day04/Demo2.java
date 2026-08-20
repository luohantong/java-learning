package com.lht.Day04;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.录入成绩数组
        int[] scores = new int[5];
        for (int i = 0; i < scores.length;) {
            System.out.print("请输入第" + (i + 1) + "个成绩：");
            if (sc.hasNextInt()) {
                scores[i] = sc.nextInt();
                i++;
            }  else {
                sc.next();
                System.out.println("输入不是有效数字，请重新输入！");
            }
        }

        // 调用各个方法
        int max = getMax(scores);
        int min = getMin(scores);
        int sum = getSum(scores);
        double avg = getAvg(scores);

        // String拼接，组装结果文本
        String result = "====成绩统计结果====\n"
                + "最高分：" + max + "\n"
                + "最低分：" + min + "\n"
                + "总分：" + sum + "\n"
                + String.format("平均分：%.2f", avg);

        System.out.println(result);
        sc.close();
    }
    /**
     * 方法：获取最高分
     * 参数：int[] arr 传入成绩数组
     * 返回：int 最高分
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) { //增强for遍历数组
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 获取最低分
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // 获取总分
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // 获取平均分
    public static double getAvg(int[] arr) {
        int sum = getSum(arr); //方法可以调用别的方法，复用代码
        return (double) sum / arr.length;
    }
}
