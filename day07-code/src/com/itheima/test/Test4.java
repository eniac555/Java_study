package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        /*
        把一个数组中的元素复制到另一个新数组中去。
         */

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
    }
}
