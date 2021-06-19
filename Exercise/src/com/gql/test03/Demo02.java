package com.gql.test03;

import java.util.Scanner;

/**
 * @Description: 某公司对固定资产进行编号：
 *    购买年份（如2010年3月购买，则购买年份的编号为201003）
 *      +产品类型（设1为台式机、2为笔记本、3为其他，统一采用两位数字表示，数字前面加0）
 *      +3位随机数.x
 * 请编程自动生成公司固定资产产品编号。
 * @author Guoqianliang
 */
public class Demo02 {
    public static void main(String[] args) {
        // 定义输入对象in
        Scanner in = new Scanner(System.in);

        // 1.对购买年份进行编号-----------------------------------
        System.out.println("请输入购买年月(如:2010年03月):");
        // 输入购买年月a
        String a = in.next();

        // 使用substring()方法,截取出输入字符串中的年份和月份
        String yearNumber = a.substring(0, 4) + a.substring(5, 7);

        // 2.对产品类型进行编号-----------------------------------
        System.out.println("请输入产品类型(输入选项:1.台式机、2.笔记本、3.其他):");
        // 输入产品类型b
        String b = in.next();
        String typeNumber = "";
        switch (b) {
            case "台式机":
                typeNumber = "01";
                break;
            case "笔记本":
                typeNumber = "02";
                break;
            case "其他":
                typeNumber = "03";
                break;
            default:
                System.out.println("请按要求输入！");
                break;
        }

        // 3.生成3位随机数-----------------------------------
        int min = 100, max = 999;
        int randomNumber = random(min, max);

        // 4.公司固定资产产品编号 = 年份编号 + 产品编号 + 3位随机数
        String result = yearNumber + typeNumber + randomNumber;

        System.out.println("公司固定资产编号为：" + result);
    }

    /**
     * 随机生成区间在[min，max]之间的一个整数
     * @param min 最小整数
     * @param max 最大整数
     * @return 随机整数
     */
    public static int random(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
