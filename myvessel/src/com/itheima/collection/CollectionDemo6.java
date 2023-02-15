package com.itheima.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo6 {
    public static void main(String[] args) {
        /*
        Collection系列集合三种通用的遍历方式:
        1.迭代器遍历
        2.增强for遍历
        3.lambda表达式遍历

        增强for遍历格式
        for(数据类型 变量名：集合/数组){

           }
         */

        Collection<String> coll = new ArrayList<>();

        coll.add("zhangsan");
        coll.add("lisi");
        coll.add("wangwu");

        //增强for进行遍历
        //注意点：
        //s其实是一个第三方变量，在循环中一次表示集合中的每一个元素
        for (String s: coll){
            System.out.println(s);
        }
        //细节：修改s的值不会改变集合中原本的数据
    }
}
