package com.itheima.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        //JFrame是一个javabean类
        //1.创建游戏主界面
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(550,500);//单位:像素
        gameJframe.setVisible(true);//没有这个就不会显示

        //2.创建登录界面
        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488,430);
        loginJframe.setVisible(true);

        //3.创建注册界面
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488,500);
        registerJframe.setVisible(true);
    }
}
