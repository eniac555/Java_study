package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        /*需求：双色球
        投注号码由6个红色球和1个蓝色球号码组成，红色从1-33中选，蓝色从1-16中选*/

        //1生成中奖号码
        int[] arr = createNumber();
        System.out.println("================================");
        System.out.println("中奖号码为：");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(arr[arr.length - 1]);

        System.out.println("================================");

        //2.用户输入彩票号码
        int[] userInputArr = userInputNumber();
        for (int i = 0; i < userInputArr.length - 1; i++) {
            System.out.print(userInputArr[i] + " ");
        }
        System.out.println(userInputArr[userInputArr.length - 1]);

        //3.判断有没有中奖
        //红球，蓝球
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length - 1; j++) {
                if (redNumber == arr[j]) {
                    redCount++;
                    break;//如果找到了，后面的数字就没有必要比较了，跳出内循环，继续找下一个数字
                }
            }
        }
        int blueNumber = userInputArr[userInputArr.length - 1];
        if (blueNumber == arr[arr.length - 1]) {
            blueCount++;
        }

        System.out.println("红球中的个数为：" + redCount);
        System.out.println("蓝球中的个数为：" + blueCount);

        //4.根据红球和蓝球个数确定中奖情况
        if (redCount == 6 && blueCount == 1) {
            System.out.println("恭喜中奖1000万!");
        } else if (redCount == 6 && blueCount == 0) {
            System.out.println("恭喜中奖500万!");
        } else if (redCount == 5 && blueCount == 1) {
            System.out.println("恭喜中奖3000!");
        } else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜中奖200!");
        } else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜中奖10!");
        } else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜中奖5!");
        } else {
            System.out.println("谢谢参与!");
        }

    }

    public static int[] createNumber() {
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < 6; ) {
            int redIndex = r.nextInt(33) + 1;
            while (!contains(arr, redIndex)) {
                arr[i] = redIndex;
                i++;
            }
        }
        int blueIndex = r.nextInt(16) + 1;
        arr[6] = blueIndex;
        return arr;
    }

    //判断数据在数组中是否存在
    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static int[] userInputNumber() {
        //创建用户够买的彩票号码
        //6个红球，1个蓝球
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        //输入红球
        for (int i = 0; i < 6; ) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();
            //1-33，唯一不重复
            if (redNumber >= 1 && redNumber <= 33) {
                if (!contains(arr, redNumber)) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("当前红球号码已经存在，请重新输入");
                }
            } else {
                System.out.println("当前红球号码超过范围");
            }
        }
        while (true) {
            System.out.println("请输入蓝球号码");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[6] = blueNumber;
                break;
            } else {
                System.out.println("当前蓝球号码不合法");
            }
        }
        return arr;
    }

}
