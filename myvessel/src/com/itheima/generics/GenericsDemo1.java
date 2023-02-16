package com.itheima.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型，集合如何存储数据

        //结论
        //如果没有集合指定类型，默认所有数据类型都是object类
        //此时可以往集合中添加任意元素
        //缺点是，在获取数据的时候，无法使用他的特有行为

        //此时推出了泛型

        ArrayList list = new ArrayList();
        int[] arr = new int[10];

        list.add("aaa");
        list.add(123);
        list.add(arr);

        Iterator it = list.iterator();
        while (it.hasNext()){
            //String s = it.next();  报错


        }
    }
}
