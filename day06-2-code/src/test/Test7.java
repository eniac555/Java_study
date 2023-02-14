package test;

public class Test7 {
    public static void main(String[] args) {
        //定义一个数组判断数组中的某一个数是否存在，将结果返回到调用处
        int[] arr = {1, 3, 45, 87, 56, 95, 103};
        System.out.println(getNumber(arr, 25));
    }

    public static boolean getNumber(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){return true;}
        }

        return false;
    }
}
