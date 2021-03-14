package com.gql.test01;

/**
 * @Description: 编写java程序，输出一个由6行“*”组成的直角三角形。
 * @author Guoqianliang
 * @date 20:39 - 2021/3/13
 */
public class Demo02 {
    public static void main(String[] args) {
        Util.method01();
        Util.method02();
    }
}

/**
 * 实验一的工具类
 */
class Util {
    protected static void method01() {
        System.out.println("方法1:傻瓜式输出");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");
        System.out.println("******");
    }

    protected static void method02() {
        System.out.println("方法2:for循环");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
