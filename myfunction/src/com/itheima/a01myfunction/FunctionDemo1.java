package com.itheima.a01myfunction;

import java.util.Arrays;

public class FunctionDemo1 {
    public static void main(String[] args) {
        //需求
        //创建一个数组，进行倒序排序
        Integer[] arr = {3,5,4,2,8,7};

        //匿名内部类
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1-o2;
//            }
//        });
//
//        System.out.println(Arrays.toString(arr));


        //lambda表达式
//        Arrays.sort(arr, (Integer o1, Integer o2)-> {
//                return o1-o2;
//            }
//        );
//
//        System.out.println(Arrays.toString(arr));


        //lambda表达式简化版
        //Arrays.sort(arr, (Integer o1, Integer o2)-> o1-o2);

        //System.out.println(Arrays.toString(arr));

        //方法引用
        //1.引用处需要是接口式函数
        //2.被引用的方法已经存在，Java已经写好的或者第三方工具
        //3.被引用的方法形参和返回值要和抽象方法一致
        //4.被引用方法的功能满足需求

        Arrays.sort(arr, FunctionDemo1::sub);

        System.out.println(Arrays.toString(arr));


    }

    public static int sub(int num1, int num2){
        return num2-num1;
    }
}
