package com.gql.test03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description: 一个任意4位正整数（各位数字不同），将数字重新组合成一个最大数及一个最小数，求最大数与最小数的差。
 * @author Guoqianliang
 * @date 16:32 - 2021/3/14
 */
public class Demo05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        System.out.println("请输入一个4位数整数(要求各位数字不同):");
        int number = in.nextInt();

        // 将整数各位分离并加入arr数组
        arr[0] = number / 1000;
        arr[1] = number / 100 % 10;
        arr[2] = number / 10 % 10;
        arr[3] = number % 10;

        // 快排
        Arrays.sort(arr);
        int max = arr[3] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[0];
        int min = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
        System.out.println("重新组合后的最大数为:" + max);
        System.out.println("重新组合后的最小数为:" + min);
        System.out.println("二者差值为:" + (max - min));
    }
}
