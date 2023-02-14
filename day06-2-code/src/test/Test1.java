package test;

public class Test1 {
    public static void main(String[] args) {
        //需求：定义一个方法求长方形周长，结果在方法中打印
        getLength(10, 20);
    }

    public static void getLength(int height, int len){
        int length = 2*(height + len);
        System.out.println(length);
    }
}
