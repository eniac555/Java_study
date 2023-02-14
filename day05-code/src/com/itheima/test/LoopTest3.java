package com.itheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        // 需求：键盘录入一个正整数 x ，判断该整数是否为一个质数。
        // 质数：如果一个整数只能被1和本身整除，那么这个数就是质数。否则这个数叫做合数
        // 7 = 1 * 7 质数
        // 8 = 1 * 8  2 * 4 合数

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();

        boolean flag = true;

        for (int i = 2; i <= number-1; i++){
            //i依此表示这个范围内的每一个数字
            if (number % i == 0){
                flag = false;
                break;}
        }

        if (flag){System.out.println("是质数");}

        else {System.out.println("不是质数");}

    }
}
