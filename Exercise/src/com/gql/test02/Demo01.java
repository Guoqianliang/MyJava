package com.gql.test02;

import java.util.Scanner;

/**
 * @Description: 编写一个程序：当程序运行时，从键盘输入圆的半径r，计算输出圆的周长C和面积S。
 * @author Guoqianliang
 */
public class Demo01 {
    static final float PI = 3.14f;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("请输入圆的半径r:");
        float r = in.nextFloat();
        // 计算周长C
        c(r);
        // 计算面积S
        s(r);
    }

    /**
     * 根据半径r计算周长C
     * @param r:半径
     */
    private static void c(Float r) {
        float result = 2 * PI * r;
        System.out.println(String.format("半径为%.2f的圆的周长为%.2f", r, result));
    }

    /**
     * 根据半径r计算面积S
     * @param r:半径
     */
    private static void s(Float r) {
        float result = PI * r * r;
        System.out.println(String.format("半径为%.2f的圆的周面积为%.2f", r, result));
    }
}


