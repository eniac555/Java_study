package com.itheima.test7;

public class GirlFriendTest {
    public static void main(String[] args) {
        /*
        定义数组存储4个女朋友的对象
        女朋友的属性：姓名、年龄、性别、爱好
        要求1：计算出四女朋友的平均年龄
        要求2：统计年龄比平均值低的女朋友有几个？并把她们的所有信息打印出来。
         */

        //1.定义数组
        GirlFriend[] arr = new GirlFriend[4];

        //2.创建对象
        GirlFriend gf1 = new GirlFriend("小诗诗", 18, "萌妹子", "吃零食");
        GirlFriend gf2 = new GirlFriend("小丹丹", 19, "萌妹子", "玩游戏");
        GirlFriend gf3 = new GirlFriend("小慧慧", 20, "萌妹子", "看书和学习");
        GirlFriend gf4 = new GirlFriend("小莉莉", 21, "憨妹子", "睡觉");

        //3.对象加到数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //4.求和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getAge();
        }
        int avg = sum / arr.length;

        System.out.println(avg);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (avg > arr[i].getAge()) {
                count++;
                System.out.println(arr[i].getName() + ", " + arr[i].getAge() + ", " + arr[i].getGender() + ", " + arr[i].getHobby());
            }
        }

        System.out.println(count);


    }
}
