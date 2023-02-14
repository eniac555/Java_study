package com.itheima.a04objectdemo;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));//false
        /*
        因为equals方法是被s调用的，而s是字符串
        所以调用String类中的equals方法
        字符串中的equals方法，先判断是否为字符串，如果是字符串，再比较内部属性
        但是参数不是字符串，所以直接返回false
         */



        System.out.println(sb.equals(s));//false
        /*
        equals方法是sb调用的，sb是StringBulider对象，
        所以要看StringBulider中的equals方法，但是他没重写
        所以调用object类中的方法
        object中是比较两个地址值，所以返回false
         */
    }
}
