package com.xiaozh.leetcode;

import java.util.Scanner;

public class NC_SortBubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int[] nums = new int[data.length];
        for(int i = 0; i<nums.length; i++){
            nums[i] = Integer.parseInt(data[i]);
        }
        BubbleSort(nums);
        for(int num: nums) System.out.print(num + " ");
    }
    private static void BubbleSort(int[] nums){
        for(int i = 0; i< nums.length; i++){
            boolean flag = true;
            for(int j = 0; j< nums.length - 1- i; j++){
                if(nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                    flag = false;
                }
            }
            if(flag) break;
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
