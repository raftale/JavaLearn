package com.xiaozh.leetcode;

public class NC_SortHeap {
    public static void main(String[] args) {
        int[] nums = {4,6,8,5,9};
//        buildMaxHeap(nums, nums.length);

        sort(nums);
        for(int num: nums) System.out.print(num  + " ");
        String str = "abcd";
        char s = str.charAt(0);

    }

    private static void test(int[] nums){

    }

    /**
     * 1.构建最大堆
     * 2.堆首元素和堆尾元素交换，并且维护堆
     * 3.
     * */
    private static void sort(int[] nums){
        int len = nums.length;
        buildMaxHeap(nums, len);

        for(int i = len-1; i>0; i--){
            swap(nums, 0, i);
            len--;
            heapify(nums, 0, len);
        }


    }

    private static void buildMaxHeap(int[] nums, int len){
        // 从第一个非叶子节点开始
        for(int i = len/2-1; i>=0; i--){
            heapify(nums, i, len);
        }

    }

    private static void heapify(int[] nums, int i, int len){
        int left = 2*i + 1;
        int right = 2*i + 2;
        int largest = i;
        if(left < len && nums[left] > nums[largest]){
            largest = left;
        }
        if(right < len && nums[right] > nums[largest]){
            largest = right;
        }
        if(largest != i){
            swap(nums, i, largest);
            heapify(nums, largest, len);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
