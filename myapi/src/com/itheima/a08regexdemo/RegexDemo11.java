package com.itheima.a08regexdemo;

public class RegexDemo11 {
    public static void main(String[] args) {
        /*
        public String[] split(String regex)
        参数regex表示正则表达式。可以将当前字符串中匹配regex正则表达式的符号作为"分隔符"来切割字符串。

        public String replaceAll(String regex,String newStr)
        参数regex表示一个正则表达式。可以将当前字符串中匹配regex正则表达式的字符串替换为newStr。


        有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
        要求1:把字符串中三个姓名之间的字母替换为vs
        要求2:把字符串中的三个姓名切割出来
         */

        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String result = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result);
        //细节:
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就用第2个参数去替换。

        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //细节:
        //方法在底层跟之前一样也会创建文本解析器的对象
        //然后从头开始去读取字符串中的内容，只要有满足的，那么就切割。



    }
}
