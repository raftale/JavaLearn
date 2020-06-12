package com.xiaozh.designPattern.Singleton;


// 懒汉式，线程安全
public class SingletonLazySafe {
    private static SingletonLazySafe singletonLazySafe;

    private SingletonLazySafe(){}

    /**
     * @Author rex
     * @Date 2018/6/8 下午7:28
     * @Description 公有获取单例对象静态函数
     * 在方法级别上加锁
     * 当一个线程进入该方法之后，其它线程试图进入该方法都必须等待，
     * 因此性能上有一定的损耗
     */
    private static synchronized SingletonLazySafe getSingletonLazySafe(){
        if(singletonLazySafe == null){
            singletonLazySafe = new SingletonLazySafe();
        }
        return singletonLazySafe;
    }

}
