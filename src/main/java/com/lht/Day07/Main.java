package com.lht.Day07;

public class Main {
    public static void main(String[] args) {
        // 父类引用，指向子类对象 → Java多态核心写法
        Person p1 = new Student("李明",18);
        Person p2 = new Teacher("王老师",35);

        //调用sayHello，实际执行子类重写后的方法
        p1.sayHello();
        p2.sayHello();


        // ✨接口引用指向实现类对象，接口也可以实现多态！
        Playable p3 = new Student("小明",18);
        Playable p4 = new Teacher("张老师",40);


        //调用play方法实际执行子类重写后的方法
        p3.play();
        p4.play();
    }
}