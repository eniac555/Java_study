package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //键盘录入三位数，获取个位、十位、百位

        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number1 = sc.nextInt();

        //2.获取个位、十位、百位
        //公式
        //个位：数字 % 10
        //十位：数字 / 10 % 10
        //百位：数字 / 100 % 10
        int ge = number1 % 10;
        int shi = number1 / 10 % 10;
        int bai = number1 / 100 % 10;
        System.out.println("个位是：" + ge);
        System.out.println("十位是：" + shi);
        System.out.println("百位是：" + bai);
    }
}
