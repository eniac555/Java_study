package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
        /*
        使用StringBuilder的场景：
        1.字符串拼接
        2.字符串反转
         */

        //判断对称字符串
        //正着和反着一样
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();

        //2.反转
        String sb = new StringBuilder().append(str).reverse().toString();

        //3.比较
        if (str.equals(sb)){
            System.out.println("一样");
        }else {
            System.out.println("不一样");
        }
        System.out.println(sb);
    }
}
