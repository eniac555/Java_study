package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        //需求：存入1,2,3,4,5  交换后变成5，4,3,2,1

        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0, j = array.length-1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
