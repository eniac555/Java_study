package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo7 {
    public static void main(String[] args) {
        /*
        Collection系列集合三种通用的遍历方式:
        1.迭代器遍历
        2.增强for遍历
        3.lambda表达式遍历

        lambda表达式遍历格式：
        default void forEach(Consumer<? super T> action);


         */

        Collection<String> coll = new ArrayList<>();

        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //匿名内部类
        //底层原理
        //其实也会自己遍历集合，依次得到每个元素
        //把得到的每个元素，传递给下面的accept方法
        //s表示集合中的每个数据
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


        //lambda表达式
        coll.forEach( s-> System.out.println(s));
    }
}
