package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /* 需求：
        您和您的约会对象正试图在餐厅获得一张桌子。
        键盘录入两个整数，表示你和你的约会对象衣服的时髦程度。（手动录入0-10之间整数）
        如果你的时髦度大于对方，相亲成功，输出true
        否则输出false
         */

        //1.键盘输入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己衣服的时髦度");
        int myFashion = sc.nextInt();
        System.out.println("请输入相亲对象的时髦度");
        int girlFashion = sc.nextInt();

        //2.把我的衣服的时髦度和对方比较
        boolean result = myFashion > girlFashion;

        //3.打印结果
        System.out.println(result);
    }
}
