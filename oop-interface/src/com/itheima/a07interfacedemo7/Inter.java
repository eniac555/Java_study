package com.itheima.a07interfacedemo7;

public interface Inter {
    /*
    接口中静态方法定义格式：public static 返回值类型 方法名(参数列表){    }

    注意事项：
    1.静态方法只能通过接口名调用，不能通过实现类名或者对象名调用
    Public可以省略，static不能省略
     */
    public abstract void show1();

    public static void show2(){
        System.out.println("接口里的静态方法");
    }
}
