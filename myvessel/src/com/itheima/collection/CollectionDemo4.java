package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo4 {
    public static void main(String[] args) {
        //1.创建集合的对象
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //2.获取迭代器对象
        //迭代器好比是一个箭头，默认指向集合的0索引处
        Iterator<String> it = coll.iterator();
        //3.利用循环不断地去获取集合中的每一个元素
        while (it.hasNext()){
            String str = it.next();//获取元素并后移指针
            System.out.println(str);
        }

        //细节：
        //指针不会复位，只能新建迭代器
        //
        //
        //
    }
}
