package com.itheima.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3(){
        //设置界面大小
        this.setSize(603, 680);//单位:像素
        //设置标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置游戏关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式进行放置
        this.setLayout(null);

        //给整个窗体添加键盘监听
        this.addKeyListener(this);
        //调用者this：本类对象，当前的界面对象，表示我要给整个界面添加监听
        //添加那个监听由addKeyListener决定


        //让界面显示出来
        this.setVisible(true);
    }


    /*
    细节1：按下一个按键不松开，会重复调用
    细节2：这么多按键如何区分？每一个按键都有对应编号
     */
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        int keyCode = e.getKeyCode();//返回
        System.out.println(keyCode);
    }
}
