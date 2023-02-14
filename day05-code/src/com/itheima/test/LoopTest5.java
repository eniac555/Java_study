package com.itheima.test;

import java.util.Random;

public class LoopTest5 {
    public static void main(String[] args) {
        /*
        需求：程序自动生成一个1-100之间的随机数，在代码中使用键盘录入去猜出这个数字是多少？
        要求：使用循环猜，一直猜中为止。
        思路分析：
        1. 生成一个1-100之间的随机数
        2. 使用键盘录入去猜出这个数字是多少
        3. 把反复猜的代码写在循环中
         */

        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            int number = r.nextInt(10);//0-9，包含0、9
            //包头不包尾，包左不包右
            System.out.println(number);
        }


    }
}
