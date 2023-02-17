package com.itheima.a06args;

public class ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(getSum(1, 2, 3, 8));
    }

    /*
    细节：
    1.方法形参中只能有一个可变参数
    2.除了可变参数外，还有其他参数，可变参数要在最后
     */

    public static int getSum(int...args){//底层是建立了一个数组args
        int sum = 0;
        for (int arg : args) {
            sum = sum+arg;
        }
        return sum;
    }
}
