package com.itheima.test;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        /*
        需求：把一个一维数组里的数据：0-15，打乱顺序
        然后按照四个一组的方式添加到二维数组
         */

        //定义一个一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱数组顺序
        //遍历数组，得到每一个元素，再和随机一个元素进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[index];
            tempArr[index] = tempArr[i];
            tempArr[i] = temp;

        }
        //验证
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();

        //添加到二维数组
        int[][] date1 = new int[4][4];
        //解法一
        //遍历一维数组的每一个元素，把每一个元素一次添加到二维数组中
        for (int i = 0; i < tempArr.length; i++) {
            date1[i / 4][i % 4] = tempArr[i];//很巧妙哈哈
        }
        for (int i = 0; i < date1.length; i++) {
            for (int j = 0; j < date1[i].length; j++) {
                System.out.print(date1[i][j] + " ");
            }
            System.out.println();
        }
        //解法二
        //遍历二维数组，再给每一个进行赋值
        int[][] date2 = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                date2[i][j]= tempArr[(i+1)*i+j];
            }
        }
        for (int i = 0; i < date2.length; i++) {
            for (int j = 0; j < date2[i].length; j++) {
                System.out.print(date2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
