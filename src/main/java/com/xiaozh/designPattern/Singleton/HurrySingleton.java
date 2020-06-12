package com.xiaozh.designPattern.Singleton;

//饿汉式，线程安全
public class HurrySingleton {
    /**
     * 私有静态变量
     * 直接实例化
     * 丢失了延迟实例化带来的节约资源的优势
     */
    //不管程序是否需要这个实例的对象，总是在类加载的时候就先创建好实例。
    private static HurrySingleton singleton = new HurrySingleton();

    //让构造函数为 private，这样该类就不会被实例化
    private HurrySingleton(){}

    //公有获取单例对象静态函数
    public static HurrySingleton getSingleton1(){
        return singleton;
    }
}
