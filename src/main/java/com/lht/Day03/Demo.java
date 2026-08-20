package com.lht.Day03;

public class Demo {
    public static void main(String[] args) {
        // 外层 i 行，内层 j 列
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
