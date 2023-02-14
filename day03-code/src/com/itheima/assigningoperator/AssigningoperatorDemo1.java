package com.itheima.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        //+=
        //
        int a = 10;
        int b = 20;
        a += b;// a = a + b
        System.out.println(a);
        System.out.println(b);

        //细节：
        //+=、-=、*=、/=、%=，底层都蕴含了一个强制类型转换
        short s = 1;
        s += 1;
        System.out.println(s);//输出int类型
    }
}
