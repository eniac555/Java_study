package com.itheima.twodimensionarr;

public class TwoDimensionArrDemo2 {
    public static void main(String[] args) {


    //二维数组动态初始化
    //数据类型[][] 数组名 = new 数据类型[m][n]
    //m表示有多少一维数组，n表示每个一维数组可以放多少元素

    int[][] arr = new int[3][5];
    //赋值
    arr[0][0] = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
