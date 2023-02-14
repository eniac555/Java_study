package com.itheima.arraydemo;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //对数组元素进行访问
        //1.获取数组元素
        int[] array = {1, 2, 3 ,4 ,5};
        int number = array[0];
        System.out.println(number);
        System.out.println(array[0]);


        //2.把数据存储在数组中
        //一旦覆盖，原来数据就不存在了
        array[0] = 100;
        System.out.println(array[0]);

    }
}
