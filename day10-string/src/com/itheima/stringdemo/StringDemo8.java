package com.itheima.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
        //定义一个方法，实现字符反转，并在控制台输出
        //
        //
        String str = "abc";
        System.out.println(reverse(str));

    }

    public static String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }
}
