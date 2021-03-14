package com.gql.test02;

/**
 * @Description: 实验二的工具类
 * @author Guoqianliang
 * @date 23:25 - 2021/3/13
 */
class Util {
    static final float PI = 3.14f;

    /**
     * 根据半径r计算周长C
     * @param r:半径
     */
    public static void c(Float r) {
        float result = 2 * PI * r;
        System.out.println(String.format("半径为%.2f的圆的周长为%.2f", r, result));

    }

    /**
     * 根据半径r计算面积S
     * @param r:半径
     */
    public static void s(Float r) {
        float result = PI * r * r;
        System.out.println(String.format("半径为%.2f的圆的周面积为%.2f", r, result));
    }

    /**
     * 根据输入的字符判断性别
     * @param x 输入的字符
     * @return String
     */
    public static String judge(String x) {
        String result = "";
        // 避免出现魔法值
        String m = "M", f = "F", u = "U";
        if (m.equals(x)) {
            result = "此人性别为男";
        } else if (f.equals(x)) {
            result = "此人性别为女女生";
        } else if (u.equals(x)) {
            result = "此人性别未知未知";
        } else {
            try {
                throw new Exception("请按要求输入字符!");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 穷举水仙花数
     */
    public static void search() {
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
