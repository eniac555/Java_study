package com.itheima.generics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list,"aaa","bbb","ccc");
        System.out.println(list);
    }
}
