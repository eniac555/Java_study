package com.itheima.sort;

public class RecursionDemo5 {
    public static void main(String[] args) {
        //递归求5的阶乘
        //方法内部再次调用方法的时候，参数必须更加的靠近出口
        System.out.println(getSum(5));

    }


    public static int getSum(int number) {
        if (number == 1) {
            return 1;
        }
        return number * getSum(number - 1);
    }

}
