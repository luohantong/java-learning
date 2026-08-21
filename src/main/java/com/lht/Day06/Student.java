package com.lht.Day06;

/**
 * 学生实体类
 */
public class Student {
    //私有属性封装
    private String id;      //学号
    private String name;    //姓名
    private int age;        //年龄
    private double score;   //成绩

    //全参构造方法，创建对象赋值
    public Student(String id, String name, int age, double score) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "学号：" + id + "，姓名：" + name + "，年龄：" + age + "，成绩：" + score;
    }

    // getter 只读，不提供setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }
}