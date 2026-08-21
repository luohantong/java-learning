package com.lht.Day07;

public class Main {
    public static void main(String[] args) {
        // 父类引用，指向子类对象 → Java多态核心写法
        Person p1 = new Student("李明",18);
        Person p2 = new Teacher("王老师",35);

        //调用sayHello，实际执行子类重写后的方法
        p1.sayHello();
        p2.sayHello();
    }
}