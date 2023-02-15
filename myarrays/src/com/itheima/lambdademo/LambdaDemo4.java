package com.itheima.lambdademo;

import java.util.Arrays;

public class LambdaDemo4 {
    public static void main(String[] args) {
        /*
        定义数组并存储一些字符，利用Arrays中的sort方法进行排序
        要求：按照字符串长度进行排序，短的在前
         */

        String[] arr = {"a", "aa", "aaaa", "aaa"};

        /*
       匿名内部类
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字符串长度排序
                return o1.length()-o2.length();
            }
        });
        */


        //lambda
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());

        System.out.println(Arrays.toString(arr));
    }
}
