package com.itheima.test8;

public class Test {
    public static void main(String[] args) {
         /*
    定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
    学生的属性：学号，姓名，年龄。
    要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
    要求2：添加完毕之后，遍历所有学生信息。
    要求3：通过id删除学生信息
    如果存在，则删除，如果不存在，则提示删除失败。
    要求4：删除完毕之后，遍历所有学生信息。
    要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
     */

        //1.创建数组存储学生对象
        Student[] arr = new Student[3];
        //2.创建学生对象并存储在数组中
        Student stu1 = new Student(1, "张三", 23);
        Student stu2 = new Student(2, "李四", 24);
        Student stu3 = new Student(3, "王五", 25);
        //3.把学生对象添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        //要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
        Student stu4 = new Student(4, "马六", 26);

        //唯一性判断
        //已经存在，无需添加
        //不存在，需要添加
        boolean flag = contains(stu4.getId(), arr);
        if (flag) {
            System.out.println("当前id重复，请修改id后再添加");
        } else {
            //把stu4添加到数组中
            //数组已经满了，只能创建新的数组，新数组长度=老数组加1
            //未满，直接添加
            int count = getCount(arr);
            if (count == arr.length) {
                //满了
                System.out.println("数组已经满了");
                //创建新数组
                Student[] newArr = creatNewArr(arr);
                newArr[count] = stu4;
                printArr(newArr); //要求2：添加完毕之后，遍历所有学生信息。

            } else {
                arr[count] = stu4;
                printArr(arr); //要求2：添加完毕之后，遍历所有学生信息。
            }
        }

        //要求3：通过id删除学生信息
        //      如果存在，则删除，如果不存在，则提示删除失败。
        //找到id在数组中对应的索引
        int index = getIndex(2, arr);
        if (index >= 0) {
            arr[index] = null;
        } else {
            System.out.println("当前id不存在，删除失败");
        }
        System.out.println(index);

        //要求4：删除完毕之后，遍历所有学生信息
        printArr(arr);//老数组，也就是没新加的数组

        //要求5：查询数组id为“2”的学生，如果存在，则将他的年龄+1岁
        int index2 = getIndex(2, arr);
        if (index2 >= 0) {
            arr[index2].setAge(arr[index2].getAge() + 1);
        } else {
            System.out.println("当前id不存在");
        }
        printArr(arr);


    }


    //id唯一性判断
    public static boolean contains(int id, Student[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (id == arr[i].getId()) {
                flag = true;
                break;
            }
        }
        return flag;
    }


    //判断数组是否满了
    public static int getCount(Student[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }


    //创建新的数组，新数组长度=老数组加1
    public static Student[] creatNewArr(Student[] arr) {
        Student[] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            //把老数组元素添加到新数组中
            newArr[i] = arr[i];
        }
        return newArr;
    }


    //遍历对象信息
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i].getId() + ", " + arr[i].getAge() + ", " + arr[i].getName());
            }
        }
    }


    //找到id在数组中对应的索引
    public static int getIndex(int id, Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                if (arr[i].getId() == id) {
                    return i;
                }
            }
        }
        //循环结束之后还没找到，就表示不存在
        return -1;
    }


}
