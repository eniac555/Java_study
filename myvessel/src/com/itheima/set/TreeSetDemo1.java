package com.itheima.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        /*
        利用TreeSet存储整数并排序
        整数类型，自动排好序
         */

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(2);
        ts.add(3);
        ts.add(1);
        ts.add(9);
        ts.add(5);
        ts.add(7);

        System.out.println(ts);//[1, 2, 3, 5, 7, 9]


        //遍历 3中都行  迭代器  增强for lambda表达式
        Iterator<Integer> iterator = ts.iterator();



    }
}
