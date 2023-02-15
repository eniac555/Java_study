package com.itheima.test;

public class Test3 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!
        以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
        第10天的时候(还没吃)，发现只剩下一个桃子了，请问，最初总共多少个桃子?
         */

        //  (day(10)+1)*2=day(9)
        System.out.println(getSum(1));

    }

    public static int getSum(int day) {
        if (day <= 0 ||day >= 11){
            return -1;
        }
        if (day == 10) {
            return 1;
        }
        return 2 * (getSum(day + 1) + 1);
    }
}
