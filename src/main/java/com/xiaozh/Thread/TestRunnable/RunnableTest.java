package com.xiaozh.Thread.TestRunnable;

public class RunnableTest implements Runnable{
    private int i;

    @Override
    public void run() {
        //不能直接调用getName()和setName()方法，Runnable只有run方法
        for(;i<5; i++) {
            System.out.println("实现Runnable接口创建线程： " + Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Main线程： " + Thread.currentThread().getName());
        RunnableTest runnableTest = new RunnableTest();
        new Thread(runnableTest).start();

        RunnableTest runnableTestWithNewName  = new RunnableTest();
        new Thread(runnableTestWithNewName, "Runnable-Thread-new").start();

    }
}
