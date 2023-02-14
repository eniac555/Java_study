package com.itheima.a03integerdemo;

public class IntegerDemo2 {
    public static void main(String[] args) {
        //在以前包装类如何进行计算
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);

        //需求：把两个对象相加
        //对象之间不能相加
        //步骤：
        //1.把对象进行拆箱，变成基本数据类型
        //2.相加
        //3.把得到的结果再进行装箱，再得到包装类

        int result = i1.intValue() + i2.intValue();
        Integer i3 = new Integer(result);
        System.out.println(i3);

    }
}
