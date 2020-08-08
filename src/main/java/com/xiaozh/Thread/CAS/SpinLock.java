package com.xiaozh.Thread.CAS;

import java.util.concurrent.atomic.AtomicReference;


/**
 * https://juejin.im/post/5a75db20f265da4e826320a9
 * https://juejin.im/post/5cbd7e6a5188250a7c4c8b0d#heading-14
 * **/
public class SpinLock {
    private AtomicReference sign = new AtomicReference<>();
    public void lock(){
        Thread current = Thread.currentThread();
        // 在lock的时候，一直while循环，直到cas操作成功；
        while (!sign.compareAndSet(null, current)){
        }
    }

    public void unlock(){
        Thread current = Thread.currentThread();
        sign .compareAndSet(current, null);
    }
}
