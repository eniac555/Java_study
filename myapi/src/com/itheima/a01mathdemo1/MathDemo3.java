package com.itheima.a01mathdemo1;

public class MathDemo3 {
    public static void main(String[] args) {
        /*
        自幂数：一个n位自然数等于自身各个位数上数字的n次幂之和
        1^3+5^3+3^3  三位的也叫水仙花数  四位的叫四叶玫瑰数
        统计水仙花数
         */

        //100-999
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
