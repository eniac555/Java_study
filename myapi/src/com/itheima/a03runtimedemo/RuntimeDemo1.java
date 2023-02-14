package com.itheima.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        public static Runtime getRuntime()    当前系统的运行环境对象
        public void exit(int status)          停止虚拟机
        public int availableProcessors()      获得CPU线程数
        public long maxMemory()               JVM能从系统中获得总内存的大小（单位：byte）
        public long totalMemory()             JVM已经从系统中获得总内存的大小（单位：byte）
        public long freeMemory()              JVM剩余内存的大小（单位：byte）
        public Process exec(string command)   运行cmd命令
         */

        //获取runtime对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r2==r1);//true

        //停止虚拟机
        //Runtime.getRuntime().exit(0);

        //线程数
        System.out.println(Runtime.getRuntime().availableProcessors());

        //总内存大小
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        //已经获得内存大小
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        //剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        //运行cmd
        Runtime.getRuntime().exec("notepad");

        //shutdown  关机
        //加上参数才能执行
        //-s:默认在1分钟后关机
        //-s -t 指定时间：指定时间后关机
        //-a：取消关机操作
        //-r：关机并重启



    }
}
