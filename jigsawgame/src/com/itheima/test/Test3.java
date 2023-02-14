package com.itheima.test;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Test3 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置界面大小
        jFrame.setSize(603, 680);//单位:像素
        //设置标题
        jFrame.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置游戏关闭模式
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照XY轴的形式进行放置
        jFrame.setLayout(null);

        //创建一个按钮对象
        JButton jtb = new JButton("点我呀");
        //设置位置和宽高
        jtb.setBounds(0,0,100,50);
        //添加动作监听
        //jtb表示组件对象，表示你要给那个组件添加事件
        //addActionListener表示给组件添加哪一个事件监听（动作监听包含：鼠标左键点击和空格）
        //参数：事件被触发以后要执行的代码
        //jtb.addActionListener(new MyActionListener());


        //匿名内部类，作用和上面一样
        jtb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我呀");
            }
        });
        //把按钮添加到界面当中
        jFrame.getContentPane().add(jtb);


        //让界面显示出来
        jFrame.setVisible(true);//没有这个就不会显示
    }
}
