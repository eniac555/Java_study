package com.itheima.stringdemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值方法获取一个字符串对象
        String s1 = "abc";
        System.out.println(s1);//用的最多，节约内存


        //2.使用new的方式来构造一个字符串

        //空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("@"+s2+"!");//中间是空的

        //传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象（多此一举）
        String s3 = new String("abc");
        System.out.println(s3);

        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //需求：修改字符串的内容，  abc-->qbc
        //abc-->{'a','b','c'}-->{'q','b','c'}-->qbc
        char[] arr = {'a','b','c','d'};
        String s4 = new String(arr);
        System.out.println(s4);//abcd

        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //应用：以后在网络当中传输的数据其实都是字节信息
        //我们一般要把字节信息进行转换，变成字符串，此时就要用到这个构造方法
        byte[] bytes = {97,98,99,100};//先查表，再转换
        String s5 = new String(bytes);
        System.out.println(s5);//abcd

    }
}
