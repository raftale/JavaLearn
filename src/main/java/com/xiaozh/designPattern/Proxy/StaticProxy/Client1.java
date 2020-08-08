package com.xiaozh.designPattern.Proxy.StaticProxy;

public class Client1 {
    public static void main(String[] args) {
        UserService userServiceImpl = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userServiceImpl);
        userServiceProxy.select();
        userServiceProxy.update();
    }
}
