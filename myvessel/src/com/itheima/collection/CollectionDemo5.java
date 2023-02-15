package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo5 {
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
            //获取元素并后移指针
            String str = it.next();
            System.out.println(str);
            //System.out.println(it.next());// aaa  ccc
            //两个next，相当于循环一次，移动两次指针
            //System.out.println(it.next());// bbb  ddd
            if ("bbb".equals(str)){
                //coll.remove("bbb");
                //细节：迭代器遍历时，不能用集合的方法进行增删，可以用下面的方式删除
                it.remove();
            }
        }
        System.out.println(coll);
    }
}
