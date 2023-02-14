package com.itheima.a02interfacedemo2;

/*
成员变量：只能是常量，默认修饰符：public static final
构造方法：没有
成员方法：只能是抽象方法，默认修饰符：public abstract
 */

public class Test {
    public static void main(String[] args) {
        System.out.println(inter.a);
        InterImpl i = new InterImpl();
        i.method();

//        Scanner sc = new Scanner(System.in);
//        sc.nextInt();


    }

}
