package com.itheima.test;

import java.util.Random;

public class LoopTest6 {
    public static void main(String[] args) {
        // 需求：1-100随机数


        //秘诀：
        //用来生成任意数到任意数之间的随机数
        //1.让这个范围头尾都减去一个数，变成从0开始
        //2.尾巴+1
        //3.最终的结果，再加上第一步减去的值

        Random r = new Random();
        int number = r.nextInt(100) + 1;
        System.out.println(number);
    }
}
