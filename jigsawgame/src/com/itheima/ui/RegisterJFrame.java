package com.itheima.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //注册相关的代码都写在这里

    public RegisterJFrame(){
        this.setSize(488,500);
        //设置标题
        this.setTitle("拼图注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //建议放在最后
        this.setVisible(true);
    }
}
