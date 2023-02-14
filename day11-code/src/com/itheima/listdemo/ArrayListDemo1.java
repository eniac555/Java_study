package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //1.创建集合对象
        //泛型：限定集合中存储数据的类型
        //ArrayList<String> list = new ArrayList<String>();//JDK7之前
        ArrayList<String> list = new ArrayList<>();//JDK7之后
        System.out.println(list);
        //此时我们创建的是ArrayList对象，而ArrayList是Java已经写好的类
        //这个类在底层做了处理，打印输出的不是地址值，而是集合中的内容
        //在展示是会用 []进行包裹


    }
}
