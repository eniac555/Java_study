package com.itheima.test;

import java.util.Scanner;

public class Test1Case2 {
    public static void main(String[] args) {
        /*
        键盘录入一个字符串，要求1：长度小于等于9
        要求2：只能是数字，把数字变成罗马数字
        注意：罗马数字没有0，遇到数字0，可以变成 “”  长度为0的字符串
         */
        String str;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个字符串");
            str = sc.next();
            if (checkStr(str)) {
                break;
            } else {
                System.out.println("当前字符串不合法，请重新输入");
            }
        }

        //2.转换为罗马数字
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(changeRoma(c));
        }
        System.out.println(sb);


    }


    //检查合法性
    public static boolean checkStr(String str) {
        //1.长度
        if (str.length() > 9) {
            return false;
        }
        //2.数据类型
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                if (i == str.length() - 1) {
                    flag = true;
                }
            } else {
//                flag = false;
                break;
            }
        }
        return flag;
    }


    //数字和罗马转换
    public static String changeRoma(char number) {
        String str;
       switch (number){
           case '0'->str = " ";
           case '1'->str = "I ";
           case '2'->str = "II ";
           case '3'->str = "III ";
           case '4'->str = "IV ";
           case '5'->str = "V ";
           case '6'->str = "VI ";
           case '7'->str = "VII ";
           case '8'->str = "VIII ";
           case '9'->str = "IX ";

           default -> str="";
       }
       return str;
    }


}
