package com.xiaozh.Thread;

public class myThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if ((i) % 10 == 0) {
                System.out.println("‐‐‐‐‐‐‐" + i);
            }
            System.out.print(i);
            try {
                sleep(1000);
                System.out.print(" 线程睡眠1秒！\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new myThread().start();
    }
}

