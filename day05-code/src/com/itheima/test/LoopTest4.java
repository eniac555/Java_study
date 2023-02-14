package com.itheima.test;

import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        // 10000，数值太大，循环太多计算量大
        // 简化思路：开根号，以81为例，平方根为9，如果a*b=81，则必定一个大于9，一个小于9，所以判断条件加个根号

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
