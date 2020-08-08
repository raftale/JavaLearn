package com.xiaozh.job;
import java.util.Scanner;

public class findPrimer {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String sss = sc.next();
            String[] strs = sss.split(",");
            if(strs.length!=2) {
                System.out.println("ERROR");
                return ;
            }
            int[] nums = new int[strs.length];
            for(int i = 0; i<strs.length; i++){
                nums[i] = Integer.parseInt(strs[i]);
            }
            int min = Math.min(nums[0],nums[1]);
            min = min>2?min:2;
            int max = Math.max(nums[0],nums[1]);
            boolean isPrime = true;
            int PrimeNumber = 0;

            int len = max - min + 1;
            int[] dp = new int[max+1];
            int sum = 0;
            for(int i = min; i*i<=max; i++){
                sum = i;
                //==0说明不是素数
                if(dp[sum]==0){
                    while(sum <= max){
                        sum += i;
                        if(sum<= max) dp[sum] = 1;
                    }
                }
            }
            for(int i = min; i<=max; i++){
                if(dp[i]==0){
                    isPrime = true;
                    PrimeNumber++;
                    System.out.print(i);
                }else{
                   isPrime = false;
                }
                if(isPrime==true) System.out.print(",");
            }



//            for(int i = min; i<=max; i++){
//                isPrime = true;
//                for(int j = 2; j<i; j++){
//                    if(i%j==0) isPrime = false;
//                }
//                if(i!=min && isPrime==true) System.out.print(",");
//                if(isPrime==true) {
//                    PrimeNumber++;
//                    System.out.print(i);
//                }
//            }

            if(PrimeNumber==0) System.out.println("NO DATA");
            else System.out.println();

        }

}
