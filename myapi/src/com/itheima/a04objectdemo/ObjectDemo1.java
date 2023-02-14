package com.itheima.a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
        public String toString()   返回对象的字符串表示形式
        public boolean equals(Object obj)  比较两个对象是否相等
        protected Object clone(int a)   对象克隆
         */

        //
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);
        //结论：如果我们打印一个对象，想要看到属性值的话，那么就重写toString方法
        //在重写时，把对象的属性进行拼接
    }
}
