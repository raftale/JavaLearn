package com.xiaozh.job;

import java.util.Scanner;

public class dpackage {
    // i : 1, 2, 3, 4, 5, 6, 7
    // j : 10, 9, 8, 7, 6, 5, 4
    // max w = i*j, s.t. i<length
    // dp[i][j]: 选择前i个，的最大价值
    public int layout(int length, int[] widths, int[] values){
        return 0;
    }


    private static int FindMax(int length, int[] widths, int[] values){
        int i,j;
        //填表
        int n = widths.length-1;
        int[][] dp = new int[n+1][length+1];
        for(i=1; i<= n ;i++) {
            for(j=1; j<= length; j++) {
                if(j < widths[i-1])  {
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    if(dp[i-1][j] > dp[i-1][j-widths[i-1]] + values[i-1]) {
                        dp[i][j] =dp[i-1][j];
                    }
                    else{
                        dp[i][j]=dp[i-1][j-widths[i-1]] + values[i-1];
                    }
                }
            }
        }
        return dp[n][length];
    }
    //优化空间后的动态规划
    private  static int FindMaxBetter(int length, int[] widths, int[] values){
        int i,j;

        int n = widths.length-1;
        int[] dp = new int[length+1];

        for(i=1; i<=n;i++) {
            for(j=length; j>=0; j--)  {
                if( j-widths[i-1]>=0 && dp[j] <= dp[j-widths[i-1]] + values[i-1] ){
                    dp[j] = dp[j-widths[i-1]] + values[i-1];
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int length = 0;
//        if(sc.hasNext()){
//            length = sc.nextInt();
//        }
//
//        sc.nextLine();
//
//        String strWidths =  sc.nextLine();
//        String[] numstr = strWidths.split(" ");
//        int[] widths = new int[numstr.length];
//        for(int i = 0; i < numstr.length; i ++) {
//            widths[i] = Integer.parseInt(numstr[i]);
//        }
//
//        String strValues =  sc.nextLine();
//        String[] numVal = strValues.split(" ");
//        int[] values = new int[numVal.length];
//        for(int i = 0; i < numstr.length; i ++) {
//            values[i] = Integer.parseInt(numVal[i]);
//        }
//
        int length = 5;
        int[] widths = {1,2,3,4,5,6,7};
        int[] values = {6,9,8,7,6,5,4};
        int res =  FindMaxBetter(length, widths, values);
        System.out.println(res);


    }
}
