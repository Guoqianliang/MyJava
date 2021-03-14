package com.gql.test03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: 实验三的工具类
 * @author Guoqianliang
 * @date 9:04 - 2021/3/14
 */
public class Util {
    private static final Scanner IN = new Scanner(System.in);

    /**
     * 随机生成区间在[min，max]之间的一个整数
     * @param min 最小整数
     * @param max 最大整数
     * @return 随机整数
     */
    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }


    /**
     * 猜数字游戏
     * 注意:仅能输入数字,输入字符会报错
     */
    public static void guess() {
        int min = 1, max = 100;
        int random = random(min, max);
        // 剩余count01次,已经猜了count02次
        int count01 = 10, count02 = 0;
        System.out.println("猜数字游戏开始,您一共有10次机会!");
        while (true) {
            if (count01 == 0) {
                break;
            }
            count01--;
            count02++;
            System.out.print("请输入你猜的数字:");
            int n = IN.nextInt();
            if (n < 1 || n > 100) {
                System.out.printf("注意:随机数在1-100之间!,您还有%d次机会\n", count02);
            }

            if (n > random) {
                System.out.printf("太大了!您还有%d次机会!\n", count01);
            } else if (n < random) {
                System.out.printf("太小了!您还有%d次机会!\n", count01);
            } else {
                System.out.println(String.format("您猜了%d次就猜中了,太棒了!", count02));
                break;
            }
        }
    }

    /**
     * 计算年份编号
     * @return 年份字符串编号
     * 注意: 输入格式一定要正确
     */
    public static String yearNumber() {
        String input = IN.next();
        String year = input.substring(0, 4);
        String month = input.substring(5, 7);
        return year + month;
    }

    /**
     * 计算产品类型编号
     * @return 产品字符串编号
     */
    public static String typeNumber() {
        String input = IN.next();
        String result = "";
        switch (input) {
            case "台式机":
                result = "01";
                break;
            case "笔记本":
                result = "02";
                break;
            case "其他":
                result = "03";
                break;
            default:
                System.out.println("请按要求输入！");
                break;
        }
        return result;
    }

    /**
     * 打印九九乘法表
     */
    public static void mulTable() {
        int number = 9;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 求数组最大值
     * @param student 某个学生的课程数组
     * @return 数组升序排列后最后一个数
     */
    public static int maxArr(int[] student) {
        int length = student.length;
        Arrays.sort(student);
        return student[length - 1];
    }

    /**
     * 求数组最小值
     * @param student数组
     * @return 数组升序排列后第一个数
     */
    public static int minArr(int[] student) {
        Arrays.sort(student);
        return student[0];
    }

    /**
     * 求数组平均值
     * @param student 某个学生的课程数组
     * @return 课程总分/人数
     */
    public static int aveArr(int[] student) {
        int length = student.length;
        int sum = 0;
        for (int i = length - 1; i >= 0; i--) {
            sum += student[i];
        }
        return (sum / length);
    }



}
