package com.itheima.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中两个方法是否正确
        int[] arr1 = {1, 2, 3, 4, 5};
        String s = ArrayUtil.printArr(arr1);
        System.out.println(s);

        double[] arr2 = {1.5, 3.7, 1.9, 5.8, 6.8};
        double result = ArrayUtil.getAverage(arr2);
        System.out.println(result);
    }
}
