package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*
        需求：定义一个集合，添加学生对象，并进行遍历。学生的属性为：姓名，年龄
        对象来自键盘输入
         */

        //1.创建集合
        ArrayList<Student> list = new ArrayList<>();

        //2。键盘录入学生信息并添加到集合
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);

            list.add(s);
        }

        //
        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i).getName()+", "+list.get(i).getAge());
        }
    }
}
