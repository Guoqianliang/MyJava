package com.gql.test07;

/**
 * @Description: 读下列代码，总结代码里涉及到的概念。
 * 涉及到的概念:
 *      一、接口: Fruit类实现FruitInterface接口,不过这里使用的很牵强,关于接口:
 *          1)接口是一种特殊的抽象类,类与接口之间是实现关系,类与抽象类之间则是继承关系.
 *          2)接口中的成员修饰符是固定的.
 *              - 成员变量前: public static final
 *              - 成员方法前: public abstract
 *          3)一个类实现了接口,就必须对接口中的所有方法进行重写,否则这个类就是抽象类,接口不能实例化.
 *          4)子类继承一个父类的同时,可以实现多个接口.
 *          5)类与类之间是单继承,接口与接口之间是多继承
 *      二、构造函数：通过构造函数创建Fruit对象.
 *      三、Getter和Setter方法 : 通过 object.getXxx(); 得到对象的name和price属性
 * @author Guoqianliang
 */
public class Demo01 {
    public static void main(String[] args) {
        Fruit apple = new Fruit("苹果", "4");
        Fruit banana = new Fruit("香蕉", "3");

        System.out.println("水果的名称是：" + apple.getName() + ",每斤的价格是：" + apple.getPrice() + "元");
        System.out.println("水果的名称是：" + banana.getName() + ",每斤的价格是：" + banana.getPrice() + "元");
    }
}

class Fruit implements FruitInterface {
    private String name;
    private String price;

    public Fruit(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}

interface FruitInterface {

}
