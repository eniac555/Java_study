package com.itheima.twodimensionarr;

public class TwoDimensionArrDemo1 {
    public static void main(String[] args) {
        /*
        二维数组静态初始化：
        数据类型[][] 数组名 = new 数据类型[][]{{元素1，元素2}, {元素1，元素2}};
        简化格式：数据类型[][] 数组名 = {{元素1，元素2}, {元素1，元素2}};
        元素访问：数组名[索引][索引]
        二维数组遍历：先得到一维数组，再遍历一边一维数组
         */

        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //建议这样定义
        int[][] arr3 = {
                {1, 2, 3, 9},
                {4, 5, 6, 7, 8}
        };

        //获取元素
        //arr1[0]表示第一个一维数组
        System.out.println(arr1[0][0]);

        //遍历二维数组
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
