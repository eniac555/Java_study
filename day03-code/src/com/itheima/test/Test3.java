package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /* 数字6是一个真正伟大的数字，键盘录入两个整数，
        如果其中一个为6，最终输出结果为true；
        如果他们的和为6的倍数，最终结果也为true
        其他情况均为false
         */

        // 分析
        //1.键盘录入两个数
        //变量 a  变量 b


        //2. a == 6  b == 6  a+b == 6
        // 满足一个即为true
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();


        // 短路运算符连接
        boolean result = number1 == 6 || number2 == 6 || number1 + number2 == 6;
        System.out.println(result);
    }
}
