package com.itheima.test;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //StringBuilder相关知识
        //容量：最多装多少
        //长度：已经装了多少
        //
        System.out.println(sb.capacity());//初始默认为16位
        System.out.println(sb.length());//0

        sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb.capacity());//原始长度*2+2--16*2+2=34
        System.out.println(sb.length());

        sb.append("abcdefghijklmnopqrstuvwxyz0123456789");
        System.out.println(sb.capacity());//超过34，以实际长度为准。。。。。。但是我这是34*2+2=70
        System.out.println(sb.length());
    }
}
