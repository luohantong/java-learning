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
                        // 学号校验：非空、纯数字、不能重复
                        if (sid.isEmpty()) {
                            System.out.println("学号不能为空！");
                            break;
                        }
                        if (!sid.matches("\\d+")) {
                            System.out.println("学号只能是纯数字，不能包含字母！");
                            break;
                        }
                        // 学号重复校验
                        boolean idExists = false;
                        for (Student s : studentList) {
                            if (s.getId().equals(sid)) {
                                idExists = true;
                                break;
                            }
                        }
                        if (idExists) {
                            System.out.println("学号已存在，不能重复！");
                            break;
                        }

                        System.out.print("请输入姓名：");
                        String sname = sc.next();
                        // 姓名校验：非空、只能是中文或英文字母
                        if (sname.isEmpty()) {
                            System.out.println("姓名不能为空！");
                            break;
                        }
                        if (!sname.matches("^[\u4e00-\u9fa5a-zA-Z]+$")) {
                            System.out.println("姓名只能是中文或英文字母，不能包含数字或特殊字符！");
                            break;
                        }

                        System.out.print("请输入年龄：");
                        if (!sc.hasNextInt()) {
                            System.out.println("年龄必须是整数，不能输入字母！");
                            sc.next(); // 消费错误输入
                            break;
                        }
                        int sage = sc.nextInt();
                        // 年龄范围校验
                        if (sage <= 0 || sage > 150) {
                            System.out.println("年龄必须在1-150之间！");
                            break;
                        }

                        System.out.print("请输入成绩：");
                        if (!sc.hasNextDouble()) {
                            System.out.println("成绩必须是数字，不能输入字母！");
                            sc.next(); // 消费错误输入
                            break;
                        }
                        double sscore = sc.nextDouble();
                        // 成绩范围校验
                        if (sscore < 0 || sscore > 100) {
                            System.out.println("成绩必须在0-100之间！");
                            break;
                        }

                        // new学生对象，存入集合
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