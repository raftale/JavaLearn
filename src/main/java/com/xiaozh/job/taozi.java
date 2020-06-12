package com.xiaozh.job;

public class taozi {
    public static void main(String[] args) {
        int n = 14;
        int money = 135142857;
        int cal = cal(14);
//        System.out.println(cal);
        int mon = money - 3^14*2;
        int a = money*4;
        int b = (money-1)/2;
        System.out.println(a+b);
        System.out.println(money);
        System.out.println((money-1)/2);
        System.out.println(money*4+(money-1)/2);
        System.out.println(money*4.5);
    }
    public static int cal(int n){
        if(n==1) {
            return 13;
        }
        return cal(n-1)*3+1;
    }
}
