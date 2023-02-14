package com.itheima.stringbuilderdemo;

public class StringBuilderDemo4 {
    public static void main(String[] args) {
        //1.创建对象
        StringBuilder sb = new StringBuilder();

        sb.append("aaa").append("bbb").append("ccc").append("ddd");

        String str = sb.toString();//学习这个
        System.out.println(str);
    }
}
