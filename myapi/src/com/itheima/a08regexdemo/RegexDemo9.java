package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {
        /*
            有如下文本，按要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台


            需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
            需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
            需求3:爬取除了版本号为8，11.17的Java文本，
        */

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11." +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //需求1
        //定义正则表达式
        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只获取前半部分
        String regex1 = "Java(?=8|11|17)";  //在Java后面拼接8或者11或者17
        Pattern p1 = Pattern.compile(regex1);
        Matcher m1 = p1.matcher(str);
        while (m1.find()){
            String s = m1.group();
            System.out.println(s);
        }

        //需求2
        String regex2 = "Java(8|11|17)";
        String regex3 = "Java(?:8|11|17)";
        Pattern p2 = Pattern.compile(regex3);
        Matcher m2 = p2.matcher(str);
        while (m2.find()){
            String s = m2.group();
            System.out.println(s);
        }

        //需求3
        String regex4 = "Java(?!8|11|17)";
        Pattern p3 = Pattern.compile(regex4);
        Matcher m3 = p3.matcher(str);
        while (m3.find()){
            String s = m3.group();
            System.out.println(s);
        }

    }
}
