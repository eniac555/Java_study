package com.itheima.a03integerdemo;

public class IntegerDemo3 {
    public static void main(String[] args) {
        /*
        从（JDK5）开始，基本类型与包装类的装箱、拆箱动作可以自动完成
        自动拆箱：把包装类自动变成基本数据类型
        自动装箱：把基本数据类型自动变成其对应的包装类

         */

        Integer i = 4;//自动装箱。相当于Integer i = Integer.valueOf(4);
        i = i + 5;//等号右边：将i对象转成基本数值(自动拆箱) i.intValue() + 5;
        //加法运算完成后，再次装箱，把基本数值转成对象。

        //JDK5以后，int和Integer可以看做同一个东西，因为他们内部可以自动转化
    }
}
