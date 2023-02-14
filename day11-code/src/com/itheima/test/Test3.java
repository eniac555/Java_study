package com.itheima.test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        //需求：定义一个集合，添加字符，并进行遍历，遍历格式：[元素1，元素2，元素3]
        /*
        基本数据类型对应的包装类：
        byte  Byte
        short  Short
        char   Character
        int   Integer
        long   Long
        float  Float
        double  Double
        boolean  Boolean
         */

        //1.建立集合
        ArrayList<Character> list = new ArrayList<>();

        //2.添加元素
        list.add('a');
        list.add('b');
        list.add('3');
        list.add('4');


        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1){
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println("]");
    }
}
