package com.xiaozh.leetcode;

public class lc26_removeDuplicates {
    private static int twoPointers(int[] nums){
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3,4};
        int i = twoPointers(nums);
        System.out.println(i);
    }
}
