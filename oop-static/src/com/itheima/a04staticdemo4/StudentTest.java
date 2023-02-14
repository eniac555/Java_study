package com.itheima.a04staticdemo4;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "阿伟老师";

        Student s1 = new Student();
        s1.name = "zhangsan";
        s1.age = 21;
        s1.show1();

        System.out.println("============");

        Student s2 = new Student();
        s2.name = "lisi";
        s2.age = 24;
        s2.show1();
    }
}
