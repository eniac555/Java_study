package com.itheima.a03integerdemo;

public class IntegerDemo4 {
    public static void main(String[] args) {
        /*
        public static String toBinaryString(int i)    得到二进制
        public static String toOctalString(int i)     得到八进制
        public static String toHexString(int i)       得到十六进制
        public static int parseInt(String s)          把字符串类型的整数转成int类型的整数

         */

        String s1 = Integer.toBinaryString(100);
        System.out.println(s1);

        String s2 = Integer.toOctalString(100);
        System.out.println(s2);

        String s3 = Integer.toHexString(100);
        System.out.println(s3);

        int i = Integer.parseInt("12345");
        System.out.println(i);
        System.out.println(i+1);
        //细节1：在类型转换时，括号中的参数只能是数字，不能是其他
        //细节2:8种包装类中，除了Character都有对应的parseXxx类型转换方法
    }
}
