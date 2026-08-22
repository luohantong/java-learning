package com.lht.Day10;

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
                System.out.println("3. 按学号删除学生");
                System.out.println("4. 修改学生信息");
                System.out.println("5. 按姓名搜索学生");
                System.out.println("6. 退出");
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
                        //按学号删除学生
                        System.out.print("请输入要删除的学号：");
                        String delid = sc.next();
                        for (Student s : studentList) {
                            if (s.getId().equals(delid)) {
                                studentList.remove(s);
                                System.out.println("✅学生删除成功！");
                                break;
                            } else {
                                System.out.println("❌学号不存在，请重新输入！");
                            }
                        }
                        break;

                    case 4:
                        //按学号修改
                        System.out.println("====按学号修改学生信息====");
                        System.out.print("请输入要修改的学号：");
                        String updateId = sc.next();
                        Student targetStu = null;
                        for (Student s : studentList) {
                            if(s.getId().equals(updateId)){
                                targetStu = s;
                                break;
                            }
                        }
                        if(targetStu == null){
                            System.out.println("❌学号不存在！");
                            break;
                        }

                        //输入新姓名，复用你原来的校验规则
                        System.out.print("请输入新姓名：");
                        String newName = sc.next();
                        if (newName.isEmpty()) {
                            System.out.println("姓名不能为空！");
                            break;
                        }
                        if (!newName.matches("^[\u4e00-\u9fa5a-zA-Z]+$")) {
                            System.out.println("姓名只能是中文或英文字母！");
                            break;
                        }

                        //输入新年龄
                        System.out.print("请输入新年龄：");
                        if (!sc.hasNextInt()) {
                            System.out.println("年龄必须是整数！");
                            sc.next();
                            break;
                        }
                        int newAge = sc.nextInt();
                        if (newAge <=0 || newAge>150){
                            System.out.println("年龄必须在1‑150之间！");
                            break;
                        }

                        //输入新成绩
                        System.out.print("请输入新成绩：");
                        if (!sc.hasNextDouble()) {
                            System.out.println("成绩必须是数字！");
                            sc.next();
                            break;
                        }
                        double newScore = sc.nextDouble();
                        if(newScore <0 || newScore>100){
                            System.out.println("成绩必须0‑100！");
                            break;
                        }

                        //赋值修改（Student类要有setter！）
                        targetStu.setName(newName);
                        targetStu.setAge(newAge);
                        targetStu.setScore(newScore);
                        System.out.println("✅修改学生信息完成！");
                        break;

                    case 5:
                        System.out.println("====按姓名搜索学生====");
                        System.out.print("请输入要搜索的姓名：");
                        String searchName = sc.next();
                        boolean hasResult = false;
                        for (Student s : studentList) {
                            if(s.getName().equals(searchName)){
                                System.out.println(s);
                                hasResult = true;
                            }
                        }
                        if(!hasResult){
                            System.out.println("🔍没有找到该姓名学生");
                        }
                        break;





                    case 6:
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