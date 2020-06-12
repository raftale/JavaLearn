package com.xiaozh.Collection;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class DetailHashMap {

    public static void main(String[] args) {

//        HashMap<Integer, String> map = new HashMap<>(2 );
//        map.put(1, 2);
//        map.put(2, 1);
////        for (Integer i: map.keySet()) {
////            System.out.println(map.get(i));
////        }
//
//        int a = 5;
//        int b = 26;
//        int n = 16;
//        System.out.println(a & n);
//        System.out.println(b & n);


        /**
         * hashMap线程不安全的例子
         * **/
        HashMap<Integer, String> map = new HashMap<>(2 );
        map.put(5,"C");
        new Thread("Thread1") {
            public void run() {
                map.put(7, "B");
                System.out.println(map);
            };
        }.start();

        new Thread("Thread2") {
            public void run() {
                map.put(3, "A");
                System.out.println(map);
            };
        }.start();

    }
}
