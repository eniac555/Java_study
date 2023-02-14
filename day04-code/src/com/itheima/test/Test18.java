package com.itheima.test;

public class Test18 {
    public static void main(String[] args) {
        /*
        需求：给你一个整数，判断是否是回文数，是，返回true，否则false
        121是，123不是
         */

        //核心思想：把数字倒过来跟原来的数字进行比较

        //1.定义数字
        int x  =12345;
        //定义一个临时变量，保存x的值
        int temp = x;
        //记录倒过来后的结果
        int num = 0;

        //2.循环开始
        while (x != 0){
            //从右往左获取每一位数字
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获得的数字拼到最右边
            num = num * 10 + ge;
        }

        //3.打印num
        System.out.println(num);
        System.out.println(x);

        //4.比较
        System.out.println(num == temp);




//        int x = 12;
//        int ge = x % 10;
//        int shi = x / 10 % 10;
//
//        int result = ge * 10 + shi;
//        System.out.println(result);

    }
}
