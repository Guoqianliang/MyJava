package com.gql.test07;

/**
 * @Description: 设计一个家政服务接口，在接口中定义一个方法：洗衣，做饭。
 *   设计一个测试类，在测试类用匿名内部类来实现接口；
 *   在main方法中实现场景：小明请了一个保姆，回去做饭。
 * @author Guoqianliang
 */
public class Demo03 {
    public static void main(String[] args) {
        // 匿名内部类
        new HouseWorkService() {
            @Override
            public void work() {
                System.out.println("小明好！我是你的小保姆，我可以为你洗衣做饭！");
            }
        }.work();
    }
}

/**
 * 家政服务接口
 */
interface HouseWorkService {
    /**
     * 洗衣做饭方法
     */
    void work();
}
