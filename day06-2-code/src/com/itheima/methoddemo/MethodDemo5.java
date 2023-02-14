package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //需求：带返回值方法定义
        double sum = getSum(100.2, 123.5, 180.2);
        System.out.println(sum);
    }

    public static double getSum(double num1, double num2, double num3){
        double result = num1 + num2 + num3;
        return result;
    }
}
