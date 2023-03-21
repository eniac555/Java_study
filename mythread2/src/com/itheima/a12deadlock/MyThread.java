package com.itheima.a12deadlock;

public class MyThread extends Thread {

    static Object objA = new Object();
    static Object objB = new Object();

    @Override
    public void run() {
        //1.循环
        while (true) {
            if ("线程A".equals(getName())) {
                //if判断没有被synchronized包住，所以内部A运行，卡到synchronized (objB)时，
                //B会进入代码开始执行else if部分，但又通过不了 synchronized (objA)，形成死锁
                synchronized (objA) {
                    System.out.println("线程A拿到了A锁，准备拿B锁");//A
                    synchronized (objB) {
                        System.out.println("线程A拿到了B锁，顺利执行完一轮");
                    }
                }
            } else if ("线程B".equals(getName())) {
                if ("线程B".equals(getName())) {
                    synchronized (objB) {
                        System.out.println("线程B拿到了B锁，准备拿A锁");//B
                        synchronized (objA) {
                            System.out.println("线程B拿到了A锁，顺利执行完一轮");
                        }
                    }
                }
            }
        }
    }
}