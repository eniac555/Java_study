package com.itheima.loopdemo;

public class WhileDemo1 {
    public static void main(String[] args) {
        // 打印1-10

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i ++;
        }
    }
}
/*
for while 异同
相同：运行规则一样
不同：for循环中，控制循环的变量归属于for循环的语法结构中，在for循环结束后，就不能被再次访问了（但循环变量拿出来，其实也可以继续用）
while循环中，控制循环的变量，对于while循环来说不归属其语法结构，在while循环结束时，该变量还可以继续被使用
 */