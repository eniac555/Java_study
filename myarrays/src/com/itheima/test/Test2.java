package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*
        有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起,
        每个月都生一对兔子小兔子长到第三个月后每个月又生一对兔子，
        假如兔子都不死，问第十二个月的兔子对数为多少?

        数列  1 1 2 3 5 8 13 斐波那契
         */

        //方法1
        //1.创建长度12的数组
//        int[] arr = new int[12];
//        //2.0索引和1索引手动赋值
//        arr[0] = 1;
//        arr[1] = 1;
//        //3.利用循环给剩余元素赋值
//        for (int i = 2; i < arr.length; i++) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }

        //System.out.println(arr[arr.length - 1]);

        //方法2
        System.out.println(getSum(12));

    }

    public static int getSum(int month) {

        if (month == 1 || month == 2) {
            return 1;
        } else {
            return getSum(month - 1) + getSum(-2);
        }
    }
}
