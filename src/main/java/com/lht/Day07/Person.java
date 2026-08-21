package com.lht.Day07;

public class Person {

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //sayHello
    public void sayHello() {
        System.out.println("你好，我是" + name + "，我今年" + age + "岁。");
    }

    //getter方法：获取属性值
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
