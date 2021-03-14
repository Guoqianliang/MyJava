package com.gql.test04;

/**
 * @Description: 编写一个求100-------200之间素数的方法。要求：边界值通过参数传进出。
 * 提示：判断一个数是否是素数，然后利用循环在给定的范围里找素数。
 * @author Guoqianliang
 * @date 17:04 - 2021/3/14
 */
public class Demo01 {
    public static void main(String[] args) {
        int begin = 100, end = 200, count = 0;
        System.out.println(begin + "到" + end + "之间的素数有：");
        for (int i = begin; i <= end; i++) {
            if (Util.isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n一共:" + count + "个");
    }
}
