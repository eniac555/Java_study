package com.itheima.methoddemo;

public class MethodDemo4 {
    public static void main(String[] args) {
        //需求：带参数的方法
        getSum(10,20);//实参
        getSum(10,50);
    }

    public static void getSum(int num1, int num2){//形参
        int result = num2 + num1;
        System.out.println(result);
    }
}
