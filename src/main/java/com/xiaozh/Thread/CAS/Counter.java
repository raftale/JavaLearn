package com.xiaozh.Thread.CAS;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


/**
 * 代码来自：Java并发编程的艺术；
 * 功能：JAVA实现原子操作：循环使用CAS实现原子操作
 * AtomicInteger：用原子方式更新的int值
 * **/
public class Counter {
    //乐观锁
    private AtomicInteger atomicI = new AtomicInteger(0);
    private int i = 0;
    public static void main(String[] args) {
        final Counter cas = new Counter();
        List<Thread> ts = new ArrayList<Thread>(600);
        long start = System.currentTimeMillis();
        for (int j = 0; j < 100; j++) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
//                        cas.count();
                        cas.safeCount();
                    }
                }
            });
            ts.add(t);
        }

        for (Thread t : ts) {
            t.start();
        }
        // 等待所有线程执行完成
        for (Thread t : ts) {
            try {
                t.join();          //当前线程main会等待t线程终止后才会继续执行
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(cas.i);
        System.out.println(cas.atomicI.get());
//        System.out.println(System.currentTimeMillis() - start);

    }

    /**
     * 使用CAS实现线程安全计数器
     */
    private void safeCount() {
        // 循环使用CAS操作直到成功为止
        for (;;) {
            int i = atomicI.get();                  // get value;
            // Atomically sets the value to the given updated value
            //     * if the current value {@code ==} the expected value.
            boolean suc = atomicI.compareAndSet(i, ++i);
            if (suc) {
                break;
            }
        }
    }
    /**
     * 非线程安全计数器
     */
    private void count() {
        i++;
    }
}