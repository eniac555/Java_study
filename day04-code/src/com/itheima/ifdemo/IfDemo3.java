package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo3 {
    public static void main(String[] args) {
        /*
        if()  else if()  ...  else
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        int score = sc.nextInt();

        if (score <= 100 && score > 0) {
            if (score >= 95 && score <= 100) {
                System.out.println("自行车一辆");
            } else if (score >= 85 && score < 95) {
                System.out.println("游乐场玩一天");
            } else {
                System.out.println("揍你一顿");
            }
        }else {
            System.out.println("成绩不合法");
        }
    }
}
