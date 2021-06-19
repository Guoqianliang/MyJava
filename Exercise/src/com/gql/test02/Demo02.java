package com.gql.test02;

import java.util.Scanner;

/**
 * @Description: 假定用一个字符来代表性别：“M”代表男生，“F”代表女生,”U”代表未知，试编写根据字符判断并输出某人性别的程序
 * @author Guoqianliang
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("请输入代表性别的字符(M,F,U):");
        String x = in.next();
        String result = judge(x);
        System.out.println(result);
    }
    /**
     * 根据输入的字符判断性别
     * @param x 输入的字符
     * @return String
     */
    private static String judge(String x) {
        String result = "";
        String m = "M", f = "F", u = "U";
        if (m.equals(x)) {
            result = "此人性别为男";
        } else if (f.equals(x)) {
            result = "此人性别为女";
        } else if (u.equals(x)) {
            result = "此人性别未知";
        } else {
            try {
                throw new Exception("请按要求输入字符!");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return result;
    }
}

