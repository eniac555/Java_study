package com.itheima.test;

public class Test2Case1 {
    public static void main(String[] args) {
        //需求：给定两个字符，A和B，A的旋转操作就是将最左边的字符移动到最右边
        //例如：A=“abcde”，移动一次结果为"bcdea"，若干次操作后，A变成B，则返回ture。
        //否则返回false

        //1.定义两个字符串
        String strA = "abcde";
        String strB = "cdeab";

        //2.调用方法进行比较
        boolean result = check(strA, strB);
        System.out.println(result);

    }


    //旋转字符串
    public static String remove(String str) {
        /*
        修改字符串的内容有两种方法：
        1.用subString进行截取，再进行拼接
        2.可以把字符串变成数组，再调整数组中的数据，再把字符数组变成字符串
         */
        String result1 = str.substring(1);
        return result1 + str.charAt(0);

    }


    //比较字符串
    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = remove(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }


}
