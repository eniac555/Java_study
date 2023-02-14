package com.itheima.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {

    //创建一个按钮对象
    JButton jbt = new JButton();

    public MyJFrame2(){
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

        //给按钮设置位置和宽高
        jbt.setBounds(0,0,100,50);
        //给按钮绑定鼠标事件
        jbt.addMouseListener(this);//表示给jtb绑定了鼠标事件

        //将按钮添加到整个界面中
        this.getContentPane().add(jbt);

        //让界面显示出来
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下不松");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划出");
    }
}
