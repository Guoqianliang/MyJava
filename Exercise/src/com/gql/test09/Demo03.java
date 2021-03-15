package com.gql.test09;

/**
 * @Description: 模拟三个老师同时分发80份学习笔记，每个老师相当于一个线程。
 *    提示：学习笔记是公用资源
 *         多个线程操作同一共享资源时,会将引发数据不安全问题。解决方案:使用线程同步 ===> 1)线程同步 2)同步代码块
 *
 * @author Guoqianliang
 * @date 22:09 - 2021/3/15
 */
public class Demo03 {
    public static void main(String[] args) {
        MyRunnableImpl myRunnable = new MyRunnableImpl();
        new Thread(myRunnable, "甲老师").start();
        new Thread(myRunnable, "乙老师").start();
        new Thread(myRunnable, "丙老师").start();
    }
}

/**
 * MyRunnableImpl类实现Runnable接口
 */
class MyRunnableImpl implements Runnable {
    /**
     * notesCount : 笔记剩余数量
     * alreadyGive: 已经发放的笔记数量
     */
    private int notesCount = 80;
    private int alreadyGive = 0;

    @Override
    synchronized public void run() {

        while (true) {
            if (notesCount <= 0) {
                break;
            }
            notesCount--;
            alreadyGive++;
            System.out.println(Thread.currentThread().getName() + "发放了第" + alreadyGive + "份学习笔记,还剩余" + notesCount + "份笔记.");
        }
    }
}
