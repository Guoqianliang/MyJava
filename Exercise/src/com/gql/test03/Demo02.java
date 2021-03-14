package com.gql.test03;

/**
 * @Description: 某公司对固定资产进行编号：
 *    购买年份（如2010年3月购买，则购买年份的编号为201003）
 *      +产品类型（设1为台式机、2为笔记本、3为其他，统一采用两位数字表示，数字前面加0）
 *      +3位随机数.x
 * 请编程自动生成公司固定资产产品编号。
 * @author Guoqianliang
 * @date 10:13 - 2021/3/14
 */
public class Demo02 {
    public static void main(String[] args) {
        System.out.println("请输入购买年份(如2010年03月):");
        String yearNumber = Util.yearNumber();

        System.out.println("请输入产品类型(输入选项:台式机、笔记本、其他):");
        String typeNumber = Util.typeNumber();

        // 自动生成3位随机数
        int min = 100, max = 999;
        int randomNumber = Util.random(min, max);

        String result = yearNumber + typeNumber + randomNumber;
        System.out.println("公司固定资产编号为：" + result);
    }
}
