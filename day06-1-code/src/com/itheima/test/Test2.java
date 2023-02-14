package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        //统计数组中能被3整除的元素个数
        int[] array = {1, 2, 3, 4 ,5, 6 ,7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0){
                count = count + 1;
            }
        }
        System.out.println("数组中能被3整除的数有"+count+"个");
    }
}
