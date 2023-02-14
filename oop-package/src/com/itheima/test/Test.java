package com.itheima.test;

import com.itheima.domain1.Teacher;

public class Test {
    public static void main(String[] args) {
         Student s = new Student();
         s.setName("zhangsan");
         s.setAge(23);
         System.out.println(s.getName()+", "+s.getAge());


        String str = "abc";
        System.out.println(str);


        Teacher t1 = new Teacher();

        com.itheima.domain2.Teacher t2 = new com.itheima.domain2.Teacher();


    }
}
