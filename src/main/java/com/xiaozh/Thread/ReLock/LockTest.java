package com.xiaozh.Thread.ReLock;

public class LockTest {
    public static void main(String[] args) {
        final Object a = new Object();
        final Object b = new Object();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (a){
                    try {
                        System.out.println("now i in three threadA-locka");
                        Thread.sleep(10001);
                        synchronized (b){
                            System.out.println("now i in three threadA-lockb");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (b){
                    try {
                        System.out.println("now i in three threadB-lockb");
                        Thread.sleep(10001);
                        synchronized (a){
                            System.out.println("now i in three threadB-lockA");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();
        threadB.start();


    }
}
