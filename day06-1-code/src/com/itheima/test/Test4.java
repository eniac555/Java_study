package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        //求数组最值
        int[] array = {55, 56, 84, 47, 65};
        int max = array[0];//初始化值应该是数组中的值，例如初始化0，数组全是负数，则结果不对了
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]){
                max = array[i];
            }
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

}
