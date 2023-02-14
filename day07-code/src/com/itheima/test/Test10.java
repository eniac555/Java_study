package com.itheima.test;

import java.util.Random;

public class Test10 {
    public static void main(String[] args) {
        //一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
        // 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。

        //1.把奖池里所有奖项打乱顺序
        int[] arr = {2, 588, 888, 1000, 10000};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着i和随机索引上的值进行交换
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        //2.遍历奖池
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //
    }
}
