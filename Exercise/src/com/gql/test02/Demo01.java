package com.gql.test02;

import java.util.Scanner;

/**
 * @Description: 编写一个程序：当程序运行时，从键盘输入圆的半径r，计算输出圆的周长C和面积S。
 * @author Guoqianliang
 * @date 21:14 - 2021/3/13
 */
public class Demo01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入圆的半径r:");
        float r = in.nextFloat();
        Util.c(r);
        Util.s(r);
    }
}


