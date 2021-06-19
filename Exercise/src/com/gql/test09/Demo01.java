package com.gql.test09;

/**
 * @Description: 读代码，并总结其描述的功能。
 *      创建了3条线程,分别设置不同的优先级后,执行.
 * @author Guoqianliang
 */
public class Demo01 {
    public static void main(String[] args) {
        // 创建线程的同时为其设置线程名Thread-1、Thread-2、Thread-3
        Thread thread1 = new Thread(new ThreadDemo(), "Thread-1");
        Thread thread2 = new Thread(new ThreadDemo(), "Thread-2");
        Thread thread3 = new Thread(new ThreadDemo(), "Thread-3");

        // 设置线程优先级：线程优先级由1~10表示,1最低,默认优先级为5,优先级高的线程获得CPU资源的概率较大。
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(5);

        // 开启线程
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            // join() : 强制执行线程
            // 较高优先级执行完毕后，次优先级才开始执行.
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

/**
 * 实现Runnable接口创建线程的步骤：
 *      1).定义一个类实现Runnable接口。
 *      2).重写接口中的run方法。
 *      3).通过Thread类的有参构造函数创建线程对象,参数是Runnable接口的子类对象。
 *      4).调用start()方法开启线程。
 *
 */
class ThreadDemo implements Runnable {

    /**
     * 重写run方法
     *   Thread.currentThread().getName()        当前线程名
     *   Thread.currentThread().getPriority()    当前线程优先级
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "优先级是:" + Thread.currentThread().getPriority());
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
