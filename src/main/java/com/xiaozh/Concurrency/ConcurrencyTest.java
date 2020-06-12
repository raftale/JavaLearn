package com.xiaozh.Concurrency;

public class ConcurrencyTest {
    private static final long count = 1000000001;

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }
    private static void concurrency() throws InterruptedException{
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });
        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        thread.join();   //"主线程" 等待 "子线程" 结束之后才能继续运行,意思就是计算时间需要等待thread线程运行完毕；
        System.out.println("concurrency: " + time +"ms, b= "+b);
    }

    private static void serial(){
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial: " + time + "ms, b = " + b + ", a = " + a);
    }








}
