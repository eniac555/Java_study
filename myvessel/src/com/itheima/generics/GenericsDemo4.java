package com.itheima.generics;

public class GenericsDemo4 {
    public static void main(String[] args) {
        /*
        泛型接口两种使用方式
        1.实现类给出具体类型
        2.实现类延续泛型，创建类对象时再确定类型
         */

        MyArrayList2 list = new MyArrayList2();
        list.add("aa");
        System.out.println(list);

        MyArrayList3<String> list3 = new MyArrayList3<>();
        list3.add("aa");
        System.out.println(list3);
    }
}
