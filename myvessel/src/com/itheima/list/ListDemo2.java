package com.itheima.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        //通过索引删除元素
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);



        //在调用方法时，如果出现了重载现象
        //优先调用实参和形参参数类型一致的方法
        list.remove(1);//删除1索引上的元素


        //手动装箱
        //手动把基本数据类型1，变成Integer类型
        //
        Integer i = Integer.valueOf(1);
        list.remove(i);
    }
}
