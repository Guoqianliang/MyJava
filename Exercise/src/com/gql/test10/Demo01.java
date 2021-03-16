package com.gql.test10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @Description: 计算从今天起，100天以后是几月几号，并格式化成xxxx年x月x日的形式打印出来。
 * 提示：
 * （1）调用Calendar类的add()方法计算100天后的日期
 * （2）调用Calendar类的getTime()方法返回Date类型对象.
 * （3）SimpleDateFormat对象格式化日期
 * @author Guoqianliang
 * @date 23:10 - 2021/3/15
 */
public class Demo01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("本程序可以计算x天之后的日期,请输入x:");
        int x = in.nextInt();
        System.out.println(x + "天之后的日期是:" + Util.calculateDate(x));
    }
}

/**
 * 工具类
 */
class Util {
    /**
     * 计算x天之后的日期
     * 关于Calendar类:
     *   .getInstance(): 创建Calendar对象
     *   .add(int field, int amount): 为calendar对象增加amount天
     *   .getTime(): 获得Data对象
     *
     * @param x : 输入的天数
     * @return String : xxxx年x月x日
     */
    public static String calculateDate(int x) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, x);
        Date data = calendar.getTime();

        // 日期格式化
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(data);
    }
}
