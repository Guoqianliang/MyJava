package com.gql.test05;

/**
 * @Description: 实现愤怒的小鸟。
 * 我们有很多种小鸟，每种小鸟都有飞的行为，还有一个弹弓，弹弓有一个弹射的行为，弹射时把小鸟弹出去，
 * 之后小鸟使用自己飞行的行为飞向小猪（不要求编写小猪的代码）。不同种类的小鸟有不同飞行的方式：
 * 红火：红色小鸟，飞行方式：正常
 * 蓝冰：蓝色小鸟，飞行方式：加速-正常-加速
 * 黄风：黄色小鸟，飞行方式：加速。
 * 提示：可以定义不同参数的构造方法产生小鸟。
 * @author Guoqianliang
 */
public class Demo05 {
    public static void main(String[] args) {
        new Bird("红火");
        new Bird("蓝冰");
        new Bird("黄风");
    }
}

class Bird {
    public Bird(String color) {
        // JDK7之后switch语句开始支持String类型
        switch (color) {
            case "红火":
                System.out.println("红火是红色小鸟，飞行方式为正常");
                break;
            case "蓝冰":
                System.out.println("蓝冰是蓝鸟小鸟，飞行方式为加速-正常-加速");
                break;
            case "黄风":
                System.out.println("黄风是黄鸟小鸟，飞行方式为加速");
                break;
            default:
                System.out.println("没有这只鸟");
                break;
        }
    }
}
