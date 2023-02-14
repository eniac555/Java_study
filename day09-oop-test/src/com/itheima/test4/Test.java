package com.itheima.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入
        //第一套体系
        //nextInt();  接收整数
        //nextDouble(); 接收小数
        //next();  接收字符串
        //遇到空格、制表符、回车就停止接收

        //第二套体系
        //nextLine(); 接收字符串
        //可以接收空格、制表符，遇到回车才停止接收数据

        //两个不能混用，要是先用nextInt，再用nextLine，会导致后者接收不到数据（回车的原因）

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();
        System.out.println(num1);
        System.out.println("请输入第二个整数");
        int num2 = sc.nextInt();
        System.out.println(num2);


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String num1 = sc.next();
        System.out.println(num1);
        System.out.println("请输入第二个字符串");
        String num2 = sc.next();
        System.out.println(num2);
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line1 = sc.nextLine();
        System.out.println(line1);
        System.out.println("请输入第二个字符串");
        String line2 = sc.nextLine();
        System.out.println(line2);

    }
}
