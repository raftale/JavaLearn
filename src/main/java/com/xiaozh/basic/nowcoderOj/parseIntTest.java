package com.xiaozh.basic.nowcoderOj;
import java.util.*;
public class parseIntTest {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int number = Integer.parseInt(cin.nextLine());      //parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
        String[] data = cin.nextLine().split(" ");
        int[] array = new int[number];
        for(int i = 0; i<number; i++){
            array[i] = Integer.parseInt(data[i]);
        }


        for(int i=0; i<number; i++){
            if(i != number-1)
                System.out.print(array[i] + " ");
            else System.out.print(array[i]);
        }


    }

}
