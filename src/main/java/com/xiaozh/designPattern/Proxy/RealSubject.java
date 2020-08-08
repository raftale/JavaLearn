package com.xiaozh.designPattern.Proxy;

public class RealSubject implements Subject{
    @Override
    public void dosomething() {
        System.out.println("call dosomething() in RealSubject");
    }
}
