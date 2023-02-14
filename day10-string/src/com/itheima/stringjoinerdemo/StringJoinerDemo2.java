package com.itheima.stringjoinerdemo;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建对象
        StringJoiner sj = new StringJoiner(", ","[","]");
        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj.length());//15,包括分隔符，以及起始结束符

        String str = sj.toString();

        System.out.println(sj);
        //
        //
    }
}
