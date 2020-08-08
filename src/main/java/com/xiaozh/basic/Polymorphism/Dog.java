package com.xiaozh.basic.Polymorphism;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("dog eat bone");
    }
    public void run(){
        System.out.println("dog can run");
    }
}
