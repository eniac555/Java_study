package com.itheima.a02systemdemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        /*
        public static void exit(int status)  终止当前运行的Java虚拟机
        public static long currentTimeMillis()  返回当前系统的时间，毫秒形式
        public static void arraycopy(数据源数据，起始索引，目的地数组，起始索引，拷贝个数)  数组拷贝
         */

        //方法的形参
        //状态码
        //0：表示当前的虚拟机是正常停止
        //非0：表示当前的虚拟机异常停止
        //System.exit(0);
        //需要把整个程序结束时需要

        System.out.println(System.currentTimeMillis());

        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10];
        System.arraycopy(arr1,0,arr2,0,5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        //细节
        //如果数据源数据和目的地数据数组都是基本数据类型，则类型要保持一致
        //在复制时需要考虑长度，超过范围会报错
        //如果都是引用数据类型，子类类型可以赋值给父类类型，要加类型强制转换
    }
}
