package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        //金额转换
        //1.键盘录入金额并判断
        Scanner sc = new Scanner(System.in);
        int money;

        while (true) {
            System.out.println("请输入一个整数");
            money = sc.nextInt();
            if (money >= 0 && money <= 9999999) {
                break;
            } else {
                System.out.println("不合法金额，请重新输入！");
            }
        }

        //2.创建大写数字表格，索引对应数值
        String str = "";
        while (money > 0) {
            int ge = money % 10;
            money = money / 10;
            str = getCapitalNumber(ge) + str;
        }

        //3.在前面得到的字符串前面补 零
        int numString = str.length();
        for (int i = 0; i < 7 - numString; i++) {
            str = "零" + str;
        }

        //4.插入单位，最终结果
        str = getNum(str);
        System.out.println(str);

    }


    //定义查表法，把数字变成大写中文
    public static String getCapitalNumber(int number) {
        String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }

    //定义方法，在大写数字后面补上单位，佰拾...
    public static String getNum(String str) {
        String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + arr[i];
        }
        return result;
    }

}
