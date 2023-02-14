package com.itheima.a05objectsdemo;

import java.util.Objects;

public class ObjectsDemo1 {
    public static void main(String[] args) {
        /*
        public static boolean equals(Object a, Object b)   先做非空判断，比较两个对象
        public static boolean isNull(Object obj)           判断对象是否为空，为空返回true
        public static boolean nonNull(Object obj)          判断对象是否为空，结果和上面相反
         */

        //1.创建学生对象
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);
        Student s3 = null;

        System.out.println(s1.equals(s2));

        boolean result = Objects.equals(s1,s3);
        System.out.println(result);
        //细节
        //1.方法底层会先判断是否为空，如果为空，直接返回false
        //2.如果非空，那么再次调用equals方法
        //3.s3是student类型，会调用student中的equals方法
        //如果没重写，就是比较地址值，若重写，则比较属性值

        System.out.println(Objects.isNull(s3));
        System.out.println(Objects.nonNull(s3));
    }
}

