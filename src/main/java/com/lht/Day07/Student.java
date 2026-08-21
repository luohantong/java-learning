package com.lht.Day07;

public class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("👋我是学生：" + super.getName() + "，今年" + super.getAge() + "岁，我正在努力学习！");
    }
}
