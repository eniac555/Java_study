package com.itheima.a04objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.equals(s2));
    }

    //结论：
    //如果没有重写object中的equals方法，那么默认使用Object中的方法进行比较，比较地址值是否相等
    //一般来讲，比较地址值相等没用，所以会重写，重写之后就是比较对象的属性

}
