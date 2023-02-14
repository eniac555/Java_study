package com.itheima.test;

public class Test8 {
    public static void main(String[] args) {
        //把上一题加密之后的数据进行解密
        //关键在+5这个步骤，加5后数字范围是5-14

        //1.定义数组记录解密后的结果
        int[] arr = {8, 3, 4, 6};
        //2.反转
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //3.加密是对10取余，0-4之间，数字加10,5-9数字不变
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 4) {
                arr[i] = 10 + arr[i];
            }
        }

        //4.-5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }



        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number*10+arr[i];
        }
        System.out.print(number);
        //
    }
}
