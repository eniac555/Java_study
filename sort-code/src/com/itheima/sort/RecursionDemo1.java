package com.itheima.sort;

public class RecursionDemo1 {
    public static void main(String[] args) {
        //利用递归求1-100的和
        //核心：找出口，找规律

        System.out.println(getSum(100));

    }

    public static  int getSum(int num){
        if (num==1){
            return 1;
        }

        return num+getSum(num-1);
    }

}
