package test;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求：使用方法重载，设计比较两个整数是否相同的方法
        要求：兼容byte/short/int/double
         */
        compare(10,20);
        compare(1.5, 1.6);
        compare((float)1.8, (float)2.5);
        compare((byte) 10,(byte) 20);
    }

    public static void compare(int a1, int a2){
        System.out.println(a1 == a2);
    }
    public static void compare(short s1, short s2){
        System.out.println(s1 == s2);
    }
    public static void compare(double d1, double d2){
        System.out.println(d1 == d2);
    }
    public static void compare(byte b1, byte b2){
        System.out.println(b1 == b2);
    }
}
