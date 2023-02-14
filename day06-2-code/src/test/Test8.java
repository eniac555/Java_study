package test;

public class Test8 {
    public static void main(String[] args) {
        //需求：定义方法：copyOfRange(int[] arr, int from, int to)
        //将数组arr从索引from（包含）开始，到索引to（不包含）的元素复制到新数组中，并返回数组
        int[] arr1 = {1, 2, 3, 4, 5 ,6, 7, 8, 9};
        int[] copyArr = copyOfRange(arr1, 2, 6);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]);
        }

    }
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] array = new int[to - from];
        for (int i = from; i < to; i++) {

            array[i-from] = arr[i];//假索引，int index = 0, index++

        }
        return array;
    }
}
