package com.xiaozh.basic.nowcoderOj;


import java.util.ArrayList;
import java.util.Scanner;
/**
 * 预先不输入数据的组数---读到文件结尾
 * */
public class NoIdeaRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        while(sc.hasNext()){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            System.out.println(a+b);
            arrayList.add(sc.next());
        }
        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
