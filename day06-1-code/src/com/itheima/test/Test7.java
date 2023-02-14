package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        //需求：数组中0索引的值和最大索引值互换
        int[] array = {1, 2, 3, 4, 5};
        int temp = array[0];
        array[0] = array[4];
        array[4] = temp;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
