package com.gql.test04;

import com.gql.test03.Util;

import java.util.Scanner;

/**
 * @Description: 求一个拥有10个数的组数中的最大值及最小值并输出。
 * @author Guoqianliang
 * @date 17:20 - 2021/3/14
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("请依次输入10个数：");
        int length = 10;
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("十个数中的最大值为：" + Util.maxArr(arr));
        System.out.println("十个数中的最小值为" + Util.minArr(arr));
    }
}
