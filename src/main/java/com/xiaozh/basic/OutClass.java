package com.xiaozh.basic;

public class OutClass {


    public static void main(String[] args) {
        int a = StaticTest.a;
        System.out.println(a);
        StaticTest.setA(5);
        System.out.println(StaticTest.a);

        String s = new String("str");
    }
}
