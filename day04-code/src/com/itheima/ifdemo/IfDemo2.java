package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo2 {
    public static void main(String[] args) {
        /*
        需求：键盘录入一个整数，表示身上的钱，
        如果大于100，吃网红餐厅，如果小于100，吃沙县大饭店。
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int money = sc.nextInt();

        if (money >= 100){
            System.out.println("网红餐厅");
        }

        else{
            System.out.println("沙县大饭店");
        }
    }
}
