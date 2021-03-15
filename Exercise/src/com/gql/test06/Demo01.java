package com.gql.test06;

/**
 * @Description: 设计一个车类，有轮子，车门，发动机等属性。设计一个子类轿车类，增加天窗属性。
 * @author Guoqianliang
 * @date 11:33 - 2021/3/15
 */
public class Demo01 {
    public static void main(String[] args) {
        Abstractcar saloonCar = new SaloonCar();
        saloonCar.show();
    }
}

/**
 * 车的抽象类
 */
abstract class Abstractcar {
    public String wheel = "轮子";
    public String carDoor = "车门";
    public String engine = "发动机";

    /**
     * 提供给字类重写后,用来打印类的信息
     */
    abstract void show();

}

/**
 * 轿车类
 */
class SaloonCar extends Abstractcar {
    private String skylight = "天窗";

    @Override
    void show() {
        System.out.println("我是一辆轿车，我有" + super.wheel + "、" + super.carDoor + "、" + super.engine + "、" + skylight);
    }
}
