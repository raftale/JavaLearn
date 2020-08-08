package com.xiaozh.basic.nowcoderOj;

import java.util.Scanner;

/**
 * 预先知道数据组数---读数据组数然后循环
 * */
public class KnowRow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+b);
        }
    }
}
