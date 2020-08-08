package com.xiaozh.leetcode;

import java.util.Scanner;

public class NC_SortInsert {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[]  data= sc.nextLine().split(" ");
        int[] nums = new int[data.length];
        for(int i = 0; i<nums.length; i++){
            nums[i] = Integer.parseInt(data[i]);
        }
        insertSort(nums);
        for(int num: nums) System.out.print(num + " ");
    }
    private static void insertSort(int[] nums){
        for(int i = 1; i< nums.length; i++){
            for(int j = i; j>0; j--){
                if(nums[j-1] > nums[j]){
                    swap(nums, j-1, j);
                }
            }
        }
    }
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
