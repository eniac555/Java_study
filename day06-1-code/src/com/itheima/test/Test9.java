package com.itheima.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        //需求：数组1-5，打乱所有数据的顺序

        //难点：如何获取数组随机索引
        // Random r = new Random();
        //int randomIndex = r.nextInt(array.length);

        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            int randomIndex = r.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
