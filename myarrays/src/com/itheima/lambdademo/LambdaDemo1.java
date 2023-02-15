package com.itheima.lambdademo;

import java.util.Arrays;

public class LambdaDemo1 {
    public static void main(String[] args) {

        Integer[] arr = {2, 3, 5, 8, 9, 1, 7, 6, 4};

//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                System.out.println("===========");
//                System.out.println("o1: "+o1);
//                System.out.println("o2: "+o2);
//                return o1-o2;
//                //o1-o2  升序
//                //o2-o1  降序
//            }
//        });

        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o1 - o2;
        });

        System.out.println(Arrays.toString(arr));

    }
}
