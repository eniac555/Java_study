package test;

public class test3 {
    public static void main(String[] args) {
        //目标：能区分出什么时候使用带返回值方法
        //需求：定义方法，比较两个长方形的面积
        double area1 = getArea(5.5,4.7);
        double area2 = getArea(4.6,5.9);
        if (area1>area2){
            System.out.println("第一个面积大");
        }else if (area1 == area2){
            System.out.println("一样");
        }else {
            System.out.println("第二个面积大");
        }
    }

    public static double getArea(double num1, double num2){
        double result = num1*num2;
        return result;
    }
}
