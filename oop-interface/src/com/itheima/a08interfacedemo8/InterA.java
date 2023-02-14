package com.itheima.a08interfacedemo8;

public interface InterA {
    public default void  show1(){
        System.out.println("show1方法开始执行");
       log1();
    }

    public default void  show2(){
        System.out.println("show2方法开始执行");
        log1();
    }


    //普通的私有方法，给默认方法服务
    private void log1(){
        System.out.println("记录程序运行中的各种细节，这里有100行代码");
    }



    public static void show3(){
        System.out.println("show3方法开始执行");
        log2();
    }
    //静态的私有方法，给静态方法服务
    private static void log2(){
        System.out.println("记录程序运行中的各种细节，这里有100行代码");
    }

}
