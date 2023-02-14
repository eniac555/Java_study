package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        //需求：遍历数组，奇数乘以2，偶数除以2
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1){
                array[i] = 2*array[i];
            }else {
                array[i] = array[i]/2;
            }
        }

        //一个循环尽量只做一件事情
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
