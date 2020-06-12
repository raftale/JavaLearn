package com.xiaozh.designPattern.Singleton;

// 懒汉式，线程不安全
public class SingletonLazy {
    private static SingletonLazy singleton;
    private SingletonLazy(){}

    // 懒加载：当程序需要这个实例的时候才去创建对象；
    public static SingletonLazy getSingleton(){
        if(singleton == null){
            singleton = new SingletonLazy();
        }
        return singleton;
    }
}
