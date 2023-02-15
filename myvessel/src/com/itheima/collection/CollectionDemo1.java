package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {
    public static void main(String[] args) {
        /*
        public boolean add(E e)              添加
        public void clear()                  清空
        public boolean remove(E e)           删除
        public boolean contains(object ob)   判断是否包含
        public boolean isEmpty()             判断是否为空
        public int size()                    集合长度


        注意点:
        Collection是个接口，不能直接创建他的对象
         */

        //目的：为了学习collection中的方法
        Collection<String> coll = new ArrayList<>();

        //1.添加元素
        //细节1：往list系列的结合添加元素，永远返回true，因为其允许重复
        //细节2：往set系列集合添加，如果添加元素存在，返回false，因为不允许重复
        coll.add("aa");
        System.out.println(coll);

        //2.清空
        coll.clear();
        System.out.println(coll);

        //3.删除
        //注意：因为collection里面定义的是共性的方法，所以不能通过索引删除，只能通过元素对象
        coll.add("bb");
        coll.remove("bb");
        System.out.println(coll);

        //4.判断是否包含
        //底层依靠equals方法进行判断是否存在的
        //如果集合中存储的是自定义对象，想通过contains判断是否存在，在javabean类中要重写equals方法
        coll.add("aaa");
        System.out.println(coll.contains("aaa"));

        //5.判断是否非空
        coll.add("aaa");
        System.out.println(coll.isEmpty());

        //6.长度
        System.out.println(coll.size());
    }
}
