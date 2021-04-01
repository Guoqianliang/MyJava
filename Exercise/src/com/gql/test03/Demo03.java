package com.gql.test03;

/**
 * @Description: 打印99乘法表
 * @author Guoqianliang
 * @date 11:13 - 2021/3/14
 */
public class Demo03 {
    public static void main(String[] args) {
        // 外循环每次都输出1行,共输出9行
        for (int i = 1; i <= 9; i++) {
            // 内循环第一次输出1列,以后每次多输出1列,共输出9列
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            // 控制换行
            System.out.println();
        }
    }
}

