package com.gql.test02;

import java.util.Scanner;

/**
 * @Description: 假定用一个字符来代表性别：“M”代表男生，“F”代表女生,”U”代表未知，试编写根据字符判断并输出某人性别的程序
 * @author Guoqianliang
 * @date 23:21 - 2021/3/13
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入代表性别的字符(M,F,U):");
        String x = in.next();
        String result = Util.judge(x);
        System.out.println(result);
    }
}

