package com.gql.test02;

/**
 * @Description: 用穷举法求出3位数中百位、十位、个位数的立方和就是该数的数。
 * @author Guoqianliang
 */
public class Demo03 {
    static int count = 0;
    public static void main(String[] args) {
        System.out.print("3位数中百位、十位、个位数的立方和就是该数的数有:");
        search();
        System.out.println("\n一共有"+count+"个.");
    }

    /**
     * 穷举水仙花数
     *
     */
    private static void search() {
        int begin = 100, end = 999;
        for (int i = begin; i <= end; i++) {
            int b = i / 100 ;
            int s = i / 10 % 10;
            int g = i % 10;
            int sum = (int) (Math.pow(b, 3) + Math.pow(s, 3) + Math.pow(g, 3));
            if (i == sum) {
                System.out.print(i + " ");
                Demo03.count++;
            }
        }
    }
}
