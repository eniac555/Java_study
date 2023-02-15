package com.itheima.lambdademo;

import java.util.Arrays;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*
        lambda的省略规则：
        1.参数类型可以省略不写
        2.如果只有一个参数，参数类型可以省略，（）也可以省略
        3.如果lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略

         */

        Integer[] arr = {2, 3, 5, 8, 9, 1, 7, 6, 4};

        //完整格式
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                    return o1 - o2;
                }
        );

        //省略格式
        Arrays.sort(arr, ( o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));
    }
}
