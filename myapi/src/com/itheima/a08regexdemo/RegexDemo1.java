package com.itheima.a08regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {

         /* 假如现在要求校验一个qq号码是否正确。
            规则:6位及20位之内，0不能在开头，必须全部是数字。
            先使用目前所学知识完成校验需求然后体验一下正则表达式检验。
        */

        String qq = "12125548972";
        System.out.println(checkQQ(qq));

        System.out.println(qq.matches("[1-9]\\d{5,19}"));
        //[1-9]表示第一位是1-9  \\d表示是数字  {5,19}表示除第一位后的长度

    }

    public static boolean checkQQ(String qq) {
        int len = qq.length();
        //先过滤异常数据，下面的就是满足要求的数据
        if (len > 20 || len < 6) {
            return false;
        }
        if (qq.startsWith("0")) {
            return false;
        }
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
