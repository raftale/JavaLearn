package com.xiaozh.Thread.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        methodOne();
    }

    private void methodOne() {
        int localvar1 = 45;
        MySharedObject localvar2 = MySharedObject.sharedInstance;
        methodTwo();
    }
    private void methodTwo() {
        Integer localvar1 = new Integer(99);
    }


}
