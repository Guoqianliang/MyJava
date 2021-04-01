package com.gql.test05;

/**
 * @Description: 创建一个Rectangle类;
 *      （1）添加两个属性width、height
 *      （2）在Rectangle类中添加两个方法计算矩形的周长与面积
 *      （3）测试该类
 * @author Guoqianliang
 * @date 17:46 - 2021/3/14
 */
public class Demo02 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 7);
        System.out.println("长为" + rectangle.getWidth() + ",宽为" + rectangle.getHeight() + "的矩形的周长C为" + rectangle.c() + ",面积S为" + rectangle.s());
    }
}
// 创建矩形类
class Rectangle {
    // 定义矩形长、宽属性
    private int width;
    private int height;

    /**
     * 计算周长
     * @return c
     */
    public int c() {
        return 2 * (width + height);
    }

    /**
     * 计算面积
     * @return s
     */
    public int s() {
        return width * height;
    }

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
