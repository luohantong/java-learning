package com.lht.Day07;

public class Teacher extends Person {

    public Teacher(String name, int age) {
        super(name, age); //调用父类构造
    }

    @Override
    public void sayHello() {
        System.out.println("👋我是老师：" + getName() + "，今年" + super.getAge() + "岁，我负责教书育人！");
    }
}