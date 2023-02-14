package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //需求：键盘录入女婿酒量，如果大于两斤，老丈人给出回应，否则不回应

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿酒量");
        int wine = sc.nextInt();

        if(wine > 2) {
            System.out.println("小伙子，不错啊！");
        }

    }
}
//if的注意点：
//1.大括号开头可以另起一行书写，但建议写在第一行末尾
//2.在语句体中，如果只有一条语句，大括号可以省略不写，int a = 10;是两句代码，建议大括号不要省略
//3.如果对布尔类型变量进行判断，不要用==号，直接把变量写在小括号中