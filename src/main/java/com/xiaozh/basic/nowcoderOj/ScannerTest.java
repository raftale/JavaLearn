package com.xiaozh.basic.nowcoderOj;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 输入
        int n = sc.nextInt();                 // 读取一个整数
        String s = sc.next();                 // 读取一个字符串
        double t = sc.nextDouble();           // 读取一个双精度浮点数
        String sRow = sc.nextLine();             // 读取一整行；

        //判断是否有下一个输入；
        boolean b = sc.hasNext();
        sc.hasNextLine();
        sc.hasNextInt();
        sc.hasNextFloat();

        //输出：
        System.out.print("");
        System.out.println();
//        System.out.printf();



    }
}
