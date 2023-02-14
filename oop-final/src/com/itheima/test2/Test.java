package com.itheima.test2;

public class Test {
    public static void main(String[] args) {
        /*
        final修饰基本数据类型：记录的值不能发生改变
        final修饰引用数据类型：记录的地址值不能发生改变，内部属性值可以变化
         */

        final double A = 3.14;
        //不能再次进行赋值

        final Student S = new Student("张三", 23);
        S.setName("李四");
        S.setAge(24);
        System.out.println(S.getName() + ", " + S.getAge());
        //可以修改属性值
    }
}
