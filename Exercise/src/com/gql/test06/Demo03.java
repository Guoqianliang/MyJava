package com.gql.test06;

/**
 * @Description: 定义一个类，包含求面积方法，可以求三角形、正方形、圆的面积，在测试类中分别创建类对象并打印你需要的图形面积。
 * @author Guoqianliang
 * @date 15:45 - 2021/3/15
 */
public class Demo03 {
    public static void main(String[] args) {
        new Area() {
        }.triangle(3, 4);

        new Area() {
        }.rectangle(5, 5);

        new Area() {
        }.round(2);
    }
}

/**
 * 计算面积的抽象类
 */
abstract class Area {
    /**
     * 计算三角形面积
     * base: 底边长
     * height：高
     */
    private double base;
    private double height;

    public void triangle(double base, double height) {
        System.out.println("底边为" + base + ",高为" + height + ",的三角形的面积是:" + base * height / 2);
    }

    /**
     * 计算矩形的面积
     * length: 长度
     * width: 宽度
     */
    private double length;
    private double width;

    public void rectangle(double length, double width) {
        System.out.println("长为" + length + ",宽为" + width + ",的矩形的面积是:" + length * width);
    }

    /**
     * 计算圆形的面积
     * PI: 3.14
     * r: 半径
     */
    private final double PI = 3.14;
    private double r;

    public void round(double r) {
        System.out.println("半径为" + r + "的圆形的面积是:" + PI * r * r);
    }
}
