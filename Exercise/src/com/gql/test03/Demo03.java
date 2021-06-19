package com.gql.test03;

/**
 * @Description: 打印99乘法表
 * @author Guoqianliang
 */
public class Demo03 {
    public static void main(String[] args) {
        // 外循环每次都输出1行,共输出9行
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }

    }
}

