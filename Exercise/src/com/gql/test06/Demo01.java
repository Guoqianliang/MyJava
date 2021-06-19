package com.gql.test06;

/**
 * @Description: 设计一个车类，有轮子，车门，发动机等属性。设计一个子类轿车类，增加天窗属性。
 * @author Guoqianliang
 */
public class Demo01 {
    public static void main(String[] args) {
        new SaloonCar().showInfo();
    }
}

/**
 * 车类
 */
class Car {
    private String wheel = "轮子";
    private String carDoor = "车门";
    private String engine = "发动机";

    public String getWheel() {
        return wheel;
    }

    public String getCarDoor() {
        return carDoor;
    }

    public String getEngine() {
        return engine;
    }
}

/**
 * 轿车类
 */
class SaloonCar extends Car {
    // 增加天窗属性
    private String skylight = "天窗";

    void showInfo() {
        System.out.println("车类的属性有:" + super.getWheel() + "," + super.getCarDoor() + "," + super.getEngine());
        System.out.println("轿车类的额外属性是:" + skylight);
    }
}
