package com.gql.test03;

import java.util.Scanner;

/**
 * @Description: 编写一个猜字游戏：随机给定一个1—100之间的被猜整数，从键盘上反复输入整数进行试猜。
 * 未猜中时，提示数过大或过小，直到所猜次数用完；猜中时，指出猜的次数。
 * 注意:仅能输入数字,输入字符会报错
 * @author Guoqianliang
 * @date 9:04 - 2021/3/14
 */
public class Demo01 {
    public static void main(String[] args) {
        // 定义输入对象in
        Scanner in = new Scanner(System.in);

        // 调用random函数生成一个随机数
        int min = 1, max = 100;
        int random = random(min, max);

        // count01=10,表示可猜次数,每猜一次count01的值会-1;
        // count02=0,表示已猜次数,每猜一次count02的值会+1;
        int count01 = 10, count02 = 0;

        System.out.println("猜数字游戏开始,您一共有10次机会!");

        // 游戏开始
        while (true) {
            // 如果猜够了10次,即count01的值被减到了0,则退出while循环
            if (count01 == 0) {
                break;
            }
            // 可猜次数-1
            count01--;
            // 已猜次数+1
            count02++;

            System.out.print("请输入你猜的数字:");

            // 利用之前定义好的输入对象in输入一个int类型的数字n
            int n = in.nextInt();

            // 情况1:用户输入的数字n不在区间[1,100],给出相应提示
            if (n < 1 || n > 100) {
                System.out.printf("注意:随机数在1-100之间!,您还有%d次机会\n", count02);
            }

            if (n > random) {
                // 情况2:用户输入的数字n > 正确答案,给出相应提示
                System.out.printf("太大了!您还有%d次机会!\n", count01);
            } else if (n < random) {
                // 情况3:用户输入的数字n < 正确答案,给出相应提示
                System.out.printf("太小了!您还有%d次机会!\n", count01);
            } else {
                // 情况4: 用户输入的数字n < 正确答案,给出相应提示,并且终止循环
                System.out.println(String.format("您猜了%d次就猜中了,太棒了!", count02));
                break;
            }
        }
    }

    /**
     * 功能:随机生成区间在[min，max]之间的一个整数
     * @param min 最小整数
     * @param max 最大整数
     * @return 随机整数
     */
    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
