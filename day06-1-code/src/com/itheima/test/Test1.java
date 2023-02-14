package com.itheima.test;

public class Test1 {
    public static void main(String[] args) {
        /*
        定义一个数组，存储1.2.3.4.5
        求数组元素的和
         */
        int sum = 0;
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
}
