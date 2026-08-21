package com.lht.Day06;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //集合存储学生对象
        ArrayList<Student> studentList = new ArrayList<>();


        try {
            while (true) {
                //打印菜单
                System.out.println("\n=====学生管理系统=====");
                System.out.println("1. 添加学生");
                System.out.println("2. 查询所有学生");
                System.out.println("3. 退出系统");
                System.out.print("请输入功能序号：");

                if (!sc.hasNextInt()) {
                    System.out.println("请输入整数");
                    sc.nextLine();
                    continue;
                }

                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        //添加学生
                        System.out.print("请输入学号：");
                        String sid = sc.next();
                        System.out.print("请输入姓名：");
                        String sname = sc.next();
                        System.out.print("请输入年龄：");
                        int sage = sc.nextInt();
                        if (sage <= 0 || sage > 150) {
                            System.out.println("年龄输入不合理！");
                            break;
                        }
                        System.out.print("请输入成绩：");
                        double sscore = sc.nextDouble();
                        if (sscore < 0 || sscore > 100) {
                            System.out.println("成绩输入不合理！");
                            break;
                        }
                        //new学生对象，存入集合
                        Student stu = new Student(sid, sname, sage, sscore);
                        studentList.add(stu);
                        System.out.println("✅学生添加成功！");
                        break;


                    case 2:
                        //查询所有学生
                        if (studentList.isEmpty()) {
                            System.out.println("暂无学生信息");
                        } else {
                            System.out.println("查询所有学生：");
                            for (Student s : studentList) {
                                System.out.println(s);
                            }
                        }
                        break;

                    case 3:
                        System.out.println("👋系统退出，再见！");
                        return;

                    default:
                        System.out.println("❌序号不存在，请输入1‑3之间数字！");
                        break;
                }
            }
        } finally {
            sc.close();
        }
    }
}
