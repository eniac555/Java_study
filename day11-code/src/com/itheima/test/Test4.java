package com.itheima.test;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求：定义一个集合，添加学生对象，并进行遍历。学生的属性为：姓名，年龄
         */

        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //
        Student std1 = new Student("zhangsan",18);
        Student std2 = new Student("lisi",19);
        Student std3 = new Student("wangwu",20);
        Student std4 = new Student("maliu",21);

        //
        list.add(std1);
        list.add(std2);
        list.add(std3);
        list.add(std4);

        //3.遍历集合

        for (int i = 0; i < list.size(); i++) {

                System.out.println(list.get(i).getName()+", "+list.get(i).getAge());
            }



    }
}
