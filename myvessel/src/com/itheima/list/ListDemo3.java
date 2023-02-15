package com.itheima.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo3 {
    public static void main(String[] args) {
        /*
        list特有遍历方式
        1.迭代器
        2.列表迭代器
        3.增强for
        4.lambda表达式
        5.普通for循环
         */

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //2.列表迭代器
        //额外加了一个方法，添加元素
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()){
            String s = lit.next();
            if ("bbb".equals(s)){
                lit.add("qqq");
            }
            System.out.println(s);
        }


        //3.增强for
        for (String s : list) {
            System.out.println(s);
        }


        //4.lambda表达式
        list.forEach(s-> System.out.println(s));


        //5.普通for循环
        //size方法和get方法还有循环结合的方式，利用索引获取集合中的每一个元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
