package com.itheima.test;

import java.util.Random;
import java.util.Scanner;


public class LoopTest7 {
    public static void main(String[] args) {
        /*
        需求：程序自动生成一个1-100之间的随机数，在代码中使用键盘录入去猜出这个数字是多少？
        要求：使用循环猜，一直猜中为止。
        思路分析：
        1. 生成一个1-100之间的随机数
        2. 使用键盘录入去猜出这个数字是多少
        3. 把反复猜的代码写在循环中
         */

        //扩展需求：保底机制，三次猜不中，就告诉他

        int count = 0;

        Random r = new Random();
        int number = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个数");
            int guessnumber = sc.nextInt();
            count ++;

            if (count == 3){
                System.out.println("猜中了");
                break;
            }

            if (guessnumber > number){
                System.out.println("大了");
            }else if (guessnumber < number){
                System.out.println("小了");
            }else {
                System.out.println("猜中了");
                break;
            }

        }

    }
}
