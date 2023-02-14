package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*
        判断101~200之间有多少个素数，并输出所有素数。
        备注：素数就是质数
         */
        int count = 0;
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.println("当前数字" + i + "是质数");
            }
        }
        System.out.println("共有" + count + "个质数");

    }
}
