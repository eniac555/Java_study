package com.itheima.switchdemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //1.default 的位置和省略
        //可以省略，但不建议省略
        //default不一定要在最后，可以写在任意位置，只不过习惯在下面

        //2.case穿透
        //break不能省略：
        //流程：首先拿着小括号的值和后面的case比较，如果匹配成功，则执行语句，
        //要是没有发现break，则会继续执行下一个case的语句
        //使用场景：如果多个case的语句重复，则可以考虑用case穿透去简化代码

        /*
        3.switch新特性，JDK12
        case 1->{ }，不会触发穿透，也不用break
         */

        /*
        4.
        switch 和 if第三种格式的使用场景
        if第三种格式：一般对于对范围的判断
        Switch：把有限个数据一一列举出来，让我们任选其一
         */
    }
}
