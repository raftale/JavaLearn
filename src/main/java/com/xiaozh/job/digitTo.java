package com.xiaozh.job;

import java.util.Deque;
import java.util.LinkedList;

public class digitTo {
    public static void main(String[] args) {
        int num = 7;
        String str = converter(num, 4);
        System.out.println(str);

    }

    private static String converter(int decimalNum, int scale){
        String targetStr = "";
        Deque<Integer> stack = new LinkedList();  // 双端队列：栈
        while(true){
            if(decimalNum < scale){
                stack.push(decimalNum);
                break;
            } else {
                stack.push(decimalNum % scale);
                decimalNum = decimalNum / scale;
            }
        }

        int time = stack.size();
        for (int i = 0; i < time; i++) {
            int popNum = (int) stack.pop();
            targetStr = targetStr + popNum;
        }
        return targetStr;
    }
}
