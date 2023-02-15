package com.itheima.arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        /*
        public static void sort(数组，排序规则)

        参数1：要排序的数组
        参数二：排序规则
        细节：
        只能用于引用数据类型
        若是基本数据类型，要转换包装类
         */

        Integer[] arr = {2,3,5,8,9,1,7,6,4};

        //第二个参数是一个接口，所以我们在调用方法的时候，需要传递这个接口的实现类对象，作为排序的规则
        //但是这个实现类，只用一次，没必要单独写一个类，可以用匿名内部类

        //底层原理
        //利用插入排序+二分查找进行排序
        //默认把0索引的数据当做有序序列，1索引到最后为无序
        //遍历无序的序列得到里面的每一个元素，假设当前遍历得到的是a元素
        //把a往有序序列中插入，在插入的时候，用二分查找确定a的插入点
        //拿着A元素，和插入点数据进行比较，比较的规则是compare的方法体
        //如果返回值是负数，拿着A继续和前面的数据进行比较
        //返回正数，拿着a和后面的元素进行比较
        //返回0，也拿着a和后面的元素进行比较
        //直到最终确定a的位置

        //compare形参  参数1：无序序列中遍历的每个元素  参数2：有序序列中的元素

        //返回值
        //负数：当前插入元素是小的，放在前面
        //正数：当前插入元素是大的，要放后面
        //0：表示当前插入元素和现在元素大小一样，插入当前元素后面


        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("===========");
                System.out.println("o1: "+o1);
                System.out.println("o2: "+o2);
                return o1-o2;
                //o1-o2  升序
                //o2-o1  降序
            }
        });

        System.out.println(Arrays.toString(arr));
    }
}
