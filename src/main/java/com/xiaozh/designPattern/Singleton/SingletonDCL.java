package com.xiaozh.designPattern.Singleton;

// 懒汉式双重校验锁（线程安全）最佳:
// 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
public class SingletonDCL {
    private volatile static SingletonDCL singletonDCL;
    private SingletonDCL(){}

    // 加同步锁前后两次判断实例是否已存在
    // 缩小的同步代码块
    public static SingletonDCL getSingleton(){
        if(singletonDCL == null){
            synchronized (SingletonDCL.class){
                if(singletonDCL == null){
                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }
}
