package com.itheima.stringdemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //已知正确的用户名和密码，用程序模拟用户登录
        //总共给三次机会，登陆之后，给出相应提示


        int count = 0;
        for (int i = 0; i < 3; i++) {
            //1.定义正确的用户名和密码
            String rightUsername = "zhangsan";
            String rightPassword = "123456";

            //2.用户输入账号密码
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名");
            String username = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            //3.比较
            if (username.equals(rightUsername) && password.equals(rightPassword)) {
                System.out.println("用户登录成功！");
                break;
            } else {
                if (i < 2) {
                    System.out.println("用户登录失败，用户名或密码有误，当前还剩" + (2 - i) + "次机会");
                } else {
                    System.out.println("账号" + username + "被锁定！请联系官方客服。");
                }

            }
        }


    }
}
