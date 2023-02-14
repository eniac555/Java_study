package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*
        需求：
        定义一个集合，用于存储三个学生对象
        属性包括姓名年龄性别
        定义一个工具类，用于获取集合中最大学生的年龄
         */

        //1.定义一个集合
        ArrayList<Student> list = new ArrayList<>();
        //2.创建学生对象
        Student s1 = new Student("zhangsan", 21, "男");
        Student s2 = new Student("lisi", 22, "女");
        Student s3 = new Student("wangwu", 23, "男");
        //3.对象加入到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        int max = StudentUtil.getMaxAge(list);
        System.out.println(max);
    }
}
