package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        /*
        boolean add(E e)  添加

        boolean remove(E e)  删除
        E remove(int index)

        E set(int index, E e)  修改

        E get(int index)  查询

        int size()   获取长度
         */

        //1.创建集合
        ArrayList<String> list = new ArrayList<>();

        //2.add
        boolean result1 = list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(result1);
        System.out.println(list);

        //3.remove
        boolean result2 = list.remove("aaa");
        System.out.println(result2);
        System.out.println(list);
        list.add("aaa");

        //根据索引删除
        String str = list.remove(2);//返回被删除的元素值
        System.out.println(str);
        list.add("aaa");

        //4.修改
        String str2 = list.set(1,"ddd");//返回被替换的旧元素
        System.out.println(str2);
        System.out.println(list);

        //5.查询
        String str3 = list.get(0);
        System.out.println(str3);

        //6.遍历
        int length = list.size();
        System.out.println(length);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
