package com.itheima.test;

import java.util.Random;

public class Test5 {
    public static void main(String[] args) {
        //需求，生成10个1-100随机数，求和，求平均，求多少数比平均值小
        int[] array = new int[10];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int number = r.nextInt(100) + 1;
            array[i] = number;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //求和
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("数组中所有数字的和为"+sum);

        //平均
        int avg = sum / array.length;
        System.out.println("数组中所有数字的均值为"+avg);

        //统计
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < avg){
                count++;
            }
        }

        System.out.println("数组中一个有"+count+"个数比均值小");
    }
}
