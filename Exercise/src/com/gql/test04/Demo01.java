package com.gql.test04;

import java.util.Scanner;

/**
 * @Description: 编写一个求100-------200之间素数的方法。要求：边界值通过参数传进出。
 * 提示：判断一个数是否是素数，然后利用循环在给定的范围里找素数。
 * @author Guoqianliang
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 定义区间边界值,并初始化计数器
        int begin = 100, end = 200, count = 0;
        System.out.println(begin + "到" + end + "之间的素数有：");
        // 遍历区间
        for (int i = begin; i <= end; i++) {
            // 如果发现是素数
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n一共:" + count + "个");
    }

    /**
     * 功能:素数判断
     * @param n 要判断的数
     * @return true 是素数；false 不是素数
     */
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
