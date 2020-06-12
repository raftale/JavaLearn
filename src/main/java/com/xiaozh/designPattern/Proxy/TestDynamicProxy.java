package com.xiaozh.designPattern.Proxy;

public class TestDynamicProxy {
    public static void main(String[] args) {
        //代理角色
        ProxyHandler proxyHandler = new ProxyHandler();
        //代理角色获得代理类，绑定代理类。
        Subject sub = (Subject) proxyHandler.bind(new RealSubject());
        sub.dosomething();
    }
}
