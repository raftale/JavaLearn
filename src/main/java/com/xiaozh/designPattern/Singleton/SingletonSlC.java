package com.xiaozh.designPattern.Singleton;

/**
 * 静态的特定：
 * 1. 全局唯一
 * 2. 只加载一次，优先于非静态；
 * 3. 生命周期属于类级别，从JVM加载到JVM卸载结束。
 * 4. 静态类不能访问外部类的非静态成员，他只能访问外部类的静态成员。
 *
 * 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存。
 * 只有当调用 getUniqueInstance()方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，
 * 此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
 *
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 * */
// 静态内部类static inner class
public class SingletonSlC {
    private static class SingletonHolder{
        private static final SingletonSlC INSTANCE = new SingletonSlC();
    }
    private SingletonSlC(){}


    public static final SingletonSlC getUniqueInstance(){
        return SingletonHolder.INSTANCE;
    }

}
