package com.xiaozh.Thread.Create;

public class testT extends Thread{
    @Override
    public void run() {
        System.out.println("线程3， 启动");
    }

    public static void main(String[] args) {
        testT thread = new testT();
        thread.start();
    }
}


