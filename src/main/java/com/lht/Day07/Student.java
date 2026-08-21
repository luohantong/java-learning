package com.lht.Day07;

public class Student extends Person implements Playable {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayHello() {
        System.out.println("👋我是学生：" + super.getName() + "，今年" + super.getAge() + "岁，我正在努力学习！");
    }

    @Override
    public void play() {
        System.out.println("🎸学生：我在弹吉他");
    }
}
