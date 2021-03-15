package com.gql.test07;

/**
 * @Description: 设计一个家政服务接口，在接口中定义一个方法：洗衣，做饭。
 *   设计一个测试类，在测试类用匿名内部类来实现接口；
 *   在main方法中实现场景：小明请了一个保姆，回去做饭。
 * @author Guoqianliang
 * @date 17:44 - 2021/3/15
 */
public class Demo03 {
    public static void main(String[] args) {
        new HouseWorkService() {
            @Override
            public void work() {
                System.out.println("主人好！我是你的小保姆，我可以为你洗衣做饭！");
            }
        }.work();
    }
}

/**
 * 家政服务接口
 */
interface HouseWorkService {
    /**
     * work方法提供给实现类
     */
    void work();
}
