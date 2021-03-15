package com.gql.test09;

/**
 * @Description: 通过实现runnable接口的方式创建一个新线程，要求mian线程打印100次”mian”，新线程打印50次“new”.
 * 实现Runnable接口创建线程的步骤：
 *      1).定义一个类实现Runnable接口。
 *      2).重写接口中的run方法。
 *      3).通过Thread类的有参构造函数创建线程对象,参数是Runnable接口的子类对象。
 *      4).调用start()方法开启线程。
 *
 * @author Guoqianliang
 * @date 21:54 - 2021/3/15
 */
public class Demo02 {
    public static void main(String[] args) {
        int var = 100;
        for (int i = 1; i <= var; i++) {
            System.out.println(Thread.currentThread().getName() + "线程==>第" + i + "次打印" + "main");
        }

        new Thread(new MyRunnable()).start();
    }
}

/**
 * MyRunnable类实现Runnable接口
 */
class MyRunnable implements Runnable {

    @Override
    public void run() {
        int var = 50;
        for (int i = 1; i <= var; i++) {
            System.out.println(Thread.currentThread().getName() + "线程==>第" + i + "次打印" + "new");
        }
    }
}
