package com.xiaozh.basic;

public class testInter implements InterfaceTest2{
    @Override
    public void method() {

    }

    public static void main(String[] args) {
        int i = InterfaceTest.staticGetInt();
        System.out.println(i);
    }
}
