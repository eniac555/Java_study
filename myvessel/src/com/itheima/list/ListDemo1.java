package com.itheima.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {
    public static void main(String[] args) {
        /*
        List系列集合独有的方法:
        void add(int index, E element)   在此集合中的指定位置插入指定的元素
        E remove(int index)              删除指定索引处的元素,返回被删除的元素
        E set(int index,E element)       修改指定索引处的元素，返回被修改的元素
        E get(int index)                 返回指定索引处的元素

         */

        //1.创建一个集合
        List<String> list = new ArrayList<>();


        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //void add(int index, E element)   在此集合中的指定位置插入指定的元素
        list.add(1,"qqq");//后面的元素顺序后移

        //E remove(int index)              删除指定索引处的元素,返回被删除的元素
        System.out.println(list.remove(1));

        //E set(int index,E element)       修改指定索引处的元素，返回被修改的元素
        System.out.println(list.set(1, "eee"));

        //E get(int index)                 返回指定索引处的元素
        System.out.println(list.get(1));

        System.out.println(list);
    }
}
