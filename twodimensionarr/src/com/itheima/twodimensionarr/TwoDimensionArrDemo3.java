package com.itheima.twodimensionarr;

public class TwoDimensionArrDemo3 {
    public static void main(String[] args) {
        /*
        某商场每个季度的营业额如下：单位（万元）
        第一季度：22，66,44
        第二季度：77,33,88
        第三季度：25,45,65
        第四季度：11,65,99
        要求计算每个季度的总营业额和全年的总营业额
         */

        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 65, 99}
        };
        int yearSum = 0;
        //遍历二维数组，得到每一个一维数组的和
        for (int i = 0; i < arr.length; i++) {
            int quarterArr = getSum(arr[i]);
            System.out.println("第" + (i + 1) + "个季度的总营业额为：" + quarterArr);
            yearSum = yearSum + quarterArr;
        }
        System.out.println("全年的总营业额为：" + yearSum);
    }


    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

}
