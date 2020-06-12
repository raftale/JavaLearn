package com.xiaozh.designPattern.Singleton;

public class staticTest {

    static  int a = 3;
    static int b = 2;
    static class holder{
        public holder(){
            System.out.println("test static 1");
        }

    }

    static{
        System.out.println("test static 2");
    }

    public static void main(String[] args) {
        SingletonSlC.getUniqueInstance();
    }
}