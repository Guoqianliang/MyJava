package com.gql.test08;

import java.util.NoSuchElementException;

/**
 * @Description: 自定义一个异常类NothissoundException和Player类，在Player的play( )方法中使用自定义异常，要求如下：
 * （1） NothissoundException继承Exception类，类中有一个无参和一个接收一个String类型参数的构造方法，
 * 构造方法中使用super关键字调用父类的构造方法。
 *
 * （2） Player类中定义一个play(int index)方法，方法接收一个int类型的参数，表示播放歌曲的索引，
 * 当index>10时，play( )方法用throw关键字抛出NothissoundException异常，创建异常对象时，调用有参的构造方法，传入“你播放的歌曲不存在”。
 *
 * （3）在测试类中创建Player对象，并调用play()方法测试自定义的NothissoundException异常，
 * 使用try…catch语句捕获异常，调用NothissoundException的getMessage( )方法打印出异常信息。
 *
 * @author Guoqianliang
 * @date 18:29 - 2021/3/15
 */
public class Demo02 {
    public static void main(String[] args) {
        new Player().play(11);
    }
}

/**
 * 自定义异常类
 */
class NothissoundException extends Exception {
    public NothissoundException() {

    }

    public NothissoundException(String message) {
        super(message);
    }
}


/**
 * Player播放类
 */
class Player {
    public void play(int index) {
        try {
            if (index > 10) {
                throw new NoSuchElementException("你播放的歌曲不存在");
            }
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }
}
