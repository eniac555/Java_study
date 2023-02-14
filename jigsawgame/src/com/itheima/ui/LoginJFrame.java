package com.itheima.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //表示登录界面
    //以后所有和登录相关的逻辑都写在这里

    public LoginJFrame(){
        //在创建登录页面时，同时给这个页面设置一些信息
        //比如宽高，直接展示出来
        this.setSize(488,430);
        //设置标题
        this.setTitle("拼图登录");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);

        //设置游戏关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setVisible(true);
    }
}
