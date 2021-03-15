package com.gql.test08;

/**
 * @Description: 阅读程序：求y阶乘。
 * @author Guoqianliang
 * @date 18:13 - 2021/3/15
 */
public class Demo01 {
    public static void main(String[] args) {
        A a = new A();
        int x;
        /**
         *  Math.random()*10的取值是[0,10),则x的取值是(-5,5]
         */
        x = 5 - (int) (Math.random() * 10);
        a.jc(x);
    }
}


class A {
    public void jc(int y) {
        try {
            if (y < 0) {
                throw new Exception();
            }

            long product = 1;
            for (int i = 1; i <= y; i++) {
                product = product * i;
            }
            System.out.println(y + "!=" + product);
        } catch (Exception e) {
            System.out.println("负数不求阶乘！");
        }
    }
}
