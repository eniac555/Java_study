package com.itheima.a06interfacedemo6;

public interface InterB {
    public default void show2(){
        System.out.println("B接口中的默认方法---show");
    }
}
