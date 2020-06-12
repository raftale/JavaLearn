package com.xiaozh.designPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler implements InvocationHandler {
    //1 实现被代理的接口
    private Object tar;

    // 绑定委托对象，并返回代理类。//2 获得代理对象,通过Proxy.newProxyInstance
    public Object bind(Object tar){
        //tar就是被代理的对象
        this.tar = tar;

        // 获取代理对象对应的 ClassLoader
        ClassLoader classLoader = tar.getClass().getClassLoader();
        // 获取所有接口的class，这里的tar就是RealSubject，它只实现了一个Subject接口
        Class[] interfaces = tar.getClass().getInterfaces();
        // 创建一个将传给代理类的调用请求处理器 ，处理所有的代理对象上的方法调用。
        ProxyHandler handler = this;
        /**
         * JDK会通过根据传入的参数信息动态地在内存中创建和.class文件等同的字节码
         * 然后根据相应的字节码转换成对应的class，
         * 然后调用newInstance()创建实例
         * **/
        return Proxy.newProxyInstance(classLoader, interfaces, handler);
//        return Proxy.newProxyInstance(tar.getClass().getClassLoader(),
//                                        tar.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        //动态代理原型：在invoke前后添加的方法就是aop原型。
        beforeInvoke(); //在调用具体函数方法前，执行功能处理
        result = method.invoke(tar, args);  //方法.invoke(接口名，参数)
        afterInvoking(); // 在调用具体函数方法后，执行功能处理
        return result;
    }

    public void beforeInvoke(){ System.out.println("before invoking"); }
    public void afterInvoking(){ System.out.println("after invoking"); }
}
