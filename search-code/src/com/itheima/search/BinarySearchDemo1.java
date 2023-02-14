package com.itheima.search;

public class BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}

        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int num = 81;

        System.out.println(binarySearch(arr, num));
    }

    public static int binarySearch(int[] arr, int num) {
        int min = 0;
        int max = arr.length - 1;
        while (true) {
            if (min > max) {
                return -1;
            }

            int mid = (min + max) / 2;

            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                max = mid - 1;
            } else if (arr[mid] < num) {
                min = mid + 1;

            }
        }

    }
}
