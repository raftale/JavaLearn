package com.xiaozh.Thread.CAS;

public class CASTest {
    static int i = 0;
    public synchronized static void increment(){
        i++;
    }
//    public static void increment1(){
//        do {
//            int k = i;
//            int j = k + 1;
//        }while (compareAndSet(i, k, j));  //操作系统保证原子性。
//    }

}
