package com.gql.test04;

import java.util.Arrays;
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

        //方法1:升序快排
        Arrays.sort(arr);

//        // 方法2:选择排序
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
        System.out.println("十个数中的最大值为：" + arr[arr.length - 1]);
        System.out.println("十个数中的最小值为" + arr[0]);
    }
}
