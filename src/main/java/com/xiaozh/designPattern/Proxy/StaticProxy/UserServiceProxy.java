package com.xiaozh.designPattern.Proxy.StaticProxy;

import java.util.Date;

//https://juejin.im/post/5c1ca8df6fb9a049b347f55c
public class UserServiceProxy implements UserService{
    private UserService target;  //被代理的对象

    public UserServiceProxy(UserService target) {
        this.target = target;
    }

    @Override
    public void select() {
        before();
        target.select();
        after();
    }

    @Override
    public void update() {
        before();
        target.update();
        after();
    }
    private void before(){
        System.out.println(String.format("log start time [%s] ", new Date()));
    }
    private void after(){
        System.out.println(String.format("log end time [%s] ", new Date()));
    }
}
