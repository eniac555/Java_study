package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        //除法
        //结论：
        //1.整数参与计算，结果只能得到整数
        //2.小数参与计算，结果优可能是不精确的，需要用到后面的知识点。
        System.out.println(10 / 2);
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3);//3.3333333333333335

        //取模、取余，得到余数
        System.out.println(10 % 2);
        System.out.println(10 % 3);

        //应用场景:
        //1.可以用取模判断A是否可以被B整除
        //A % B
        //2.判断一个数是否为偶数，对2取余
        //A % 2
        //3.发牌，每张牌定义一个序号，对人数取余

    }
}
