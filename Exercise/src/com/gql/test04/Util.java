package com.gql.test04;

/**
 * @Description: 实验四的工具类
 * @author Guoqianliang
 * @date 17:04 - 2021/3/14
 */
public class Util {
    /**
     * 素数判断
     * @param n 要判断的数
     * @return true 是；false 否
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
