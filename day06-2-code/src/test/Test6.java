package test;

public class Test6 {
    public static void main(String[] args) {
        //需求：设计一个方法用于获取数组中元素的最大值
        int[] arr = {1, 2, 3, 4, 5};
        int max = max(arr);
        System.out.println(max);

    }

    public static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){}
            max = arr[i];
        }
        return max;

    }

}
