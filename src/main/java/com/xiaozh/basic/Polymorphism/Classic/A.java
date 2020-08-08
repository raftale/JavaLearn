package com.xiaozh.basic.Polymorphism.Classic;

public class A{
    public String show(D obj){
        return ("A and D");
    }
    public String show(A obj){
        return ("A and A");
    }
}
