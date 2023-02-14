package com.itheima.test;

public class Test19 {
    public static void main(String[] args) {
        /*
        需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）
        将两数相除，要求不能使用乘法、除法和%运算
        得到商和余数
         */

        //分析：被除数/除数 = 商
        //思想：连续作差，记录作差次数，作为商，以及最后的值，作为余数

        int divided = 101;
        int divisor = 10;
        int i = 0;
        while (divided >= divisor){
            divided = divided - divisor;
            i ++;

        }
        System.out.println(divided);//余数
        System.out.println(i);//商
    }
}
