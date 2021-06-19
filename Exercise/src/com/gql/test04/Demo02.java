package com.gql.test04;

import java.util.Scanner;

/**
 * @Description: 求一个拥有10个数的组数中的最大值及最小值并输出。
 * @author Guoqianliang
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("请依次输入10个数：");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }
        // 选择排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // 交换
                    swap(arr, i, j);
                }
            }
        }
        // 打印排序后的数组
        printArr(arr);
    }

    /**
     * 交换位置
     * @param arr
     * @param from
     * @param to
     */
    private static void swap(int[] arr, int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    /**
     * 打印并求最值
     * @param arr
     */
    private static void printArr(int[] arr) {
        System.out.print("排序后的数组为:[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i] + ",");
        }
        System.out.println("]. 最大值是:" + arr[arr.length - 1] + ",最小值是:" + arr[0]);
    }
    // 冒泡排序
//    private static void bubbleSort(int[] arr) {
//        for (int i = arr.length - 1; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    // 交换
//                    swap(arr, j, j + 1);
//                }
//            }
//        }
//        // 打印
//        System.out.print("冒泡");
//        printArr(arr);
//    }
}

