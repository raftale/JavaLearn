package com.xiaozh.basic;

public class StaticTest {
    public static int a = 3;
    int b = 2;
    public static int getA(){
        return a;
    }


    public static void setA(int a) {
        StaticTest.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
