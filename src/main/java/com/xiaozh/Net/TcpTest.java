package com.xiaozh.Net;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TcpTest {
    public static void main(String[] args) throws UnknownHostException {
        //InetAddress由主机名（host name）+Ip组成；
        InetAddress[] addresses = InetAddress.getAllByName("baidu.com");
        System.out.println();
        for (InetAddress inetAddress: addresses){
            System.out.println("host name: "+ inetAddress.getHostName());   //获取主机名
            System.out.println("host address: " + inetAddress.getHostAddress());
            System.out.println("IP address： "+ Arrays.toString(inetAddress.getAddress())); //获取ip地址
            System.out.println("-------");
        }
        System.out.println(InetAddress.getLocalHost());  // 本机主机名和ip地址
        System.out.println();
    }
}
