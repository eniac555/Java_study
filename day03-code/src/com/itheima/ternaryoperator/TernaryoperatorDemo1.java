package com.itheima.ternaryoperator;

public class TernaryoperatorDemo1 {
    public static void main(String[] args) {

        // 需求：使用三元运算符，获取两个数的较大值

        //1.定义两个变量，记录整数
        int a = 10;
        int b = 20;

        //2.使用三元运算符获取较大值
        //格式：  关系表达式？表达式1：表达式2；
        //整个三元运算符的结果必须要被使用

        int max = a > b? a: b;
        System.out.println(max);
        System.out.println(a > b? a: b);
    }
}
