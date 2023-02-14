package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
         /*
            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制

            除基取余法：
            不断的除以基数（几进制）得到余数
            直到商为0，再将余数倒着拼起来
         */

        System.out.println(toBinaryString(6));


    }

    public static String toBinaryString(int num){
        //核心逻辑:
        //不断的去除以2，得到余数，一直到商为日就结束。
        //还需要把余数倒着拼接起来

        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();
        //利用循环不断的除以2获取余数
        while (true){
            if (num==0){
                break;
            }
            //获取余数
            int remainder = num%2;
            System.out.println(remainder);
            sb.insert(0,remainder);
            //除以2
            num = num/2;
        }
        return sb.toString();
    }
}
