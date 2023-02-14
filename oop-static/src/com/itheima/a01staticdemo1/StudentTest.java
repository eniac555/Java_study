package com.itheima.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        //1.创建第一个学生对象
        Student s1 = new Student();
        s1.setName("zhangsan");
        s1.setAge(21);
        s1.setGender("男");
        s1.teacherName = "awei";
        //Student.teacherName = "awei";
        //另一种调用方式

        s1.study();
        s1.show();

        //1.创建第一个学生对象
        Student s2 = new Student();
        s2.setName("lisi");
        s2.setAge(22);
        s2.setGender("女");

        s2.study();
        s2.show();


    }
}
