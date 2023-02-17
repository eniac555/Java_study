package com.itheima.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {
        /*
        利用set系列集合，添加字符串，并使用多种遍历方式
        迭代器
        增强for
        lambda表达式
         */

        //1.创建set对象
        Set<String> s = new HashSet<>();
        //2.添加元素，不可重复，添加成功返回true
        s.add("aaa");
        s.add("lisi");
        s.add("bob");
        s.add("wangwu");
        System.out.println(s.add("aaa"));//false
        System.out.println(s);

        //遍历

        //迭代器
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        //增强for
        for (String s1 : s) {
            System.out.println(s1);
        }

        //lambda
        s.forEach(str -> System.out.println(str));

    }
}
