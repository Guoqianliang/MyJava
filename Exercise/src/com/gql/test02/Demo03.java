package com.gql.test02;

/**
 * @Description: 用穷举法求出3位数中百位、十位、个位数的立方和就是该数的数。
 * @author Guoqianliang
 * @date 8:36 - 2021/3/14
 */
public class Demo03 {
    static int count = 0;
    public static void main(String[] args) {
        System.out.print("3位数中百位、十位、个位数的立方和就是该数的数有:");
        Util.search();
        System.out.println("\n一共有"+count+"个.");
    }
}
