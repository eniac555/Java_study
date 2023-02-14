package com.itheima.a04staticdemo4;

public class Student {
    /*
    静态方法中没有this关键字
    静态方法中，只能访问静态的东西
    非静态方法可以访问所有
     */
    String name;
    int age;
    static String teacherName;

    //this：表示当前方法调用者的地址值
    //这个this：是由虚拟机赋值的
    public void show1(Student this) {
        System.out.println(name + ", " + age + ", " + teacherName);
    }

    public static void method() {
        System.out.println("静态方法");
    }
}
