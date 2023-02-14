package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        //键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符和数字字符出现的次数
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //2.统计
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //依次序得到每个字符索引
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            } else {
                System.out.println("不合法字符");
            }
        }
        System.out.println("大写字符的数目为：" + bigCount);
        System.out.println("小写字符的数目为：" + smallCount);
        System.out.println("数字字符的数目为：" + numberCount);
        //
    }
}
