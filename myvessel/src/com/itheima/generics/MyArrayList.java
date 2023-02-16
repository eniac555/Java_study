package com.itheima.generics;

import java.util.Arrays;

public class MyArrayList <E>{//泛型类
    Object[] obj = new Object[10];
    int size;

    //E不确定的类型  e变量名
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
