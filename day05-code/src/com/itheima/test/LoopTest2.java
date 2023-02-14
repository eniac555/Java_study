package com.itheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*需求：键盘录入一个大于等于2的整数 x ，计算并返回 x 的 平方根 。
        结果只保留整数部分 ，小数部分将被舍去 。*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();

        for (int i =1; i <= number; i++){
            //i * i再和number比较
            if (i*i == number){
                System.out.println(i+"就是"+number+"的平方根");
                break;//一旦找到，循环就可以终止，后面不需要再找了，提高代码运行效率
            }
            else if (i*i > number){
                System.out.println((i-1)+"就是"+number+"的平方根的整数部分");
                break;
            }

        }
    }
}
