package com.itheima.arraydemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        /*
        定义一个数组，用来存储班里50个学生姓名
        姓名未知，等学生报道后添加
         */

        //格式：
        //数据类型[] 数组名 = new 数据类型[数组长度]；

        String[] array = new String[50];
        //添加学生
        array[0] = "张三";
        array[1] = "李四";
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        //数组默认初始化规律：
        //整数：0   小数：0.0   字符型：空格   布尔：false  引用数据类型：null
    }
}

/*
静态和动态初始化区别：
知道个数，不知道具体值，用动态
 */