package com.itheima.test2;

public class Test {
    public static void main(String[] args) {
        //两部分参数
        //第一部分：要输出的内容%s（占位）
        //第二部分：填充的数据
        System.out.printf("你好啊%s","张三");//你好啊张三
        System.out.println();
        System.out.printf("%s你好啊%s","张三","李四");//张三你好啊李四
    }
}
