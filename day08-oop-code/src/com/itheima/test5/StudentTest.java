package com.itheima.test5;

public class StudentTest {
    public static void main(String[] args) {
        //创建对象

        //空参构造
        Student s = new Student();
        System.out.println(s.getName());

        //有参构造
        Student s1 = new Student("张三",23);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
    }
}
