package com.xiaozh.Thread.Test;

import jdk.nashorn.internal.ir.CallNode;

public class MySharedObject {
    public static final MySharedObject sharedInstance= new MySharedObject();

    public Integer object2 = new Integer(22);
    public Integer object4 = new Integer(44);
    public long number1 = 12345;
    public long number2 = 654321;
}
