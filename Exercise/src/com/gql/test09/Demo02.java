package com.gql.test09;

/**
 * @Description: 通过实现runnable接口的方式创建一个新线程，要求mian线程打印100次”mian”，新线程打印50次“new”.
 * 实现Runnable接口创建线程的步骤:
 *      1).实现Runnable接口,并重写Run方法.
 *      2).通过构造方法创建Thread类的对象,参数是Runnable接口的实现类对象.
 *      3).调用start方法开启线程
 * @author Guoqianliang
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
