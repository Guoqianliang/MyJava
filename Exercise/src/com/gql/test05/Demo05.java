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
 * @date 19:58 - 2021/3/14
 */
public class Demo05 {
    public static void main(String[] args) {
        AbstractBird redBird = new RedBird();
        AbstractBird blueBird = new BlueBird();
        AbstractBird yellowBird = new YelloBird();
        redBird.fly();
        blueBird.fly();
        yellowBird.fly();
    }
}

/**
 * 抽象类
 */
abstract class AbstractBird {
    /**
     * 抽象方法fly: 定义了鸟类的飞行方式
     */
    abstract void fly();
}

class RedBird extends AbstractBird {
    @Override
    void fly() {
        System.out.println("红鸟的飞行方式为正常");
    }
}

class BlueBird extends AbstractBird {

    @Override
    void fly() {
        System.out.println("蓝鸟的飞行方式为加速-正常-加速");
    }
}

class YelloBird extends AbstractBird {

    @Override
    void fly() {
        System.out.println("黄鸟的飞行方式为加速");
    }
}
