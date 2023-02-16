package com.itheima.generics;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {
    }
    //定义一个静态方法addAll，用来添加多个集合的元素

    public static <E> void addAll(ArrayList<E> list, E e1, E e2, E e3) {//泛型方法的定义
        list.add(e1);
        list.add(e2);
        list.add(e3);

    }

    public static <E> void addAll2(ArrayList<E> list, E...e) {
        for (E e1 : e) {
            list.add(e1);
        }

    }
}
