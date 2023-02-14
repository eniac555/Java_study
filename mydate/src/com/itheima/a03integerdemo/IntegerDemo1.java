package com.itheima.a03integerdemo;

public class IntegerDemo1 {
    public static void main(String[] args) {
        //public Integer(int value)：根据 int 值创建 Integer 对象(过时)
        Integer i1 = new Integer(100);
        System.out.println(i1);

        //public Integer(String s)：根据 String 值创建 Integer 对象(过时)
        Integer i2 = new Integer("100");
        //Integer i2 = new Integer("abc"); //NumberFormatException
        System.out.println(i2);
        System.out.println("--------");

        //public static Integer valueOf(int i)：返回表示指定的 int 值的 Integer 实例
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);

        //public static Integer valueOf(String s)：返回保存指定String值的Integer对象
        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);
        Integer i5 = Integer.valueOf("100",10);//10进制

        //两种获取方式的区别
        //-128 - 127之内，针对于valueof，都是从已经创建好的对象中拿的，所以两个127一样，128不一样
        //
        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6==i7);//true

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i9==i8);//false，因为是新建的

        // new 出来的，地址肯定不一样，所以是false
        Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);
        System.out.println(i10==i11);//false

        Integer i12 = new Integer(128);
        Integer i13 = new Integer(128);
        System.out.println(i12==i13);//false


    }
}
