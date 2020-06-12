package com.xiaozh.Thread.TestThread;

public class ThreadTest extends Thread {
    private int i;

    @Override
    public void run() {
        for ( ; i < 2; i++) {
            System.out.println("继承Thread启动线程： "+ getName() + " : " + i);
        }
        setName("Thread-new");
        for ( ; i < 4; i++) {
            System.out.println("重命名后的新线程名： "+ Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("main线程： "+ Thread.currentThread().getName());
        new ThreadTest().start();;
    }
}
