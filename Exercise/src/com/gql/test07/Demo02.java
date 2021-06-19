package com.gql.test07;

/**
 * @Description: 编写接口和实现类：动物（animal）会动，老虎（tigger）会跑，鸟（bird）会飞，鱼（fish）会游。测试运行结果.
 * @author Guoqianliang
 */
public class Demo02 {
    public static void main(String[] args) {
        new TiggerImpl().move();
        new BirdImpl().move();
        new FishImpl().move();
    }
}

/**
 * 动物接口
 */
interface AnimalService {
    void move();
}

/**
 * 老虎实现欸
 */
class TiggerImpl implements AnimalService {

    @Override
    public void move() {
        System.out.println("我是一只小老虎，我会跑。");
    }
}

class BirdImpl implements AnimalService {

    @Override
    public void move() {
        System.out.println("我是一只小鸟，我会飞。");
    }
}

class FishImpl implements AnimalService {

    @Override
    public void move() {
        System.out.println("我是一只小鱼，我会游。");
    }
}
