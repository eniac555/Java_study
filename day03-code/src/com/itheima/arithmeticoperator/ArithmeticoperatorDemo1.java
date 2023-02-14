package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        // +
        System.out.println(3 + 2);
        // -
        System.out.println(5 - 4);
        // *
        System.out.println(7 * 9);

        //如果计算有小数参与
        //结论
        //在代码中，如果小数参与计算，结果有可能是不精确的，具体在JavaSE讲解
        System.out.println(1.1 + 1.01);//2.1100000000000003
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);
        // %
        System.out.println(15 % 10);
    }
}
