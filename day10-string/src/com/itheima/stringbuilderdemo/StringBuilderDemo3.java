package com.itheima.stringbuilderdemo;

public class StringBuilderDemo3 {
    public static void main(String[] args) {
        //1.创建stringbuilder对象
        StringBuilder sb = new StringBuilder();

        //普及：因为StringBuilder是JAVA已经写好的类，在底层对他进行了处理，打印的是属性值而不是地址值

        //2.添加元素
        sb.append(1);
        sb.append(2.3);
        System.out.println(sb);

        //3.反转
        System.out.println(sb.reverse());

        //4.获取长度
        System.out.println(sb.length());

    }
}
