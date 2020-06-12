package com.xiaozh.leetcode;

import java.util.ArrayList;
import java.util.List;

public class findKth {
    private static int median3( int[] a, int left, int right ) {
        int Center = ( left + right ) / 2;

        if( a[ left ] > a[ Center ] )
            swap( a, left, Center );
        if( a[ left ] > a[ right ] )
            swap( a, left, right );

        if( a[ Center ] > a[ right ] )
            swap( a, Center, right );
        swap( a, Center, right-1 );
        return a[ right - 1 ];

    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // 切分元素, 时间复杂度O(n)
    private static int partition(int[] nums, int left, int right){
        int pivot = left;
        int i = left;
        int j = right + 1;
        while(true){
            while(nums[++i]<nums[pivot]){
                if(i==right) break;
            }
            while(nums[--j]>nums[pivot]){
                if(j==left) break;
            }
            if(i>=j) break;
            swap(nums, i, j);
        }
        swap(nums, j, pivot);
        return j;
    }

    // 从最小数起，第k大的元素
    // 时间复杂度O(n*log(n)) 时间复杂度 : 平均情况 O(N)，最坏情况 O(N^2)
    private static int sortQuick(int[] nums, int k){
        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int j = partition(nums, left, right);
            if(j == k) break;
            if(j > k){
                right = j - 1;
            }else{
                left = j + 1 ;
            }
        }
        return nums[k];
    }

    // 从最大数起，第k大的元素
    public static int findKthLargest(int[] nums, int k) {
        int res = sortQuick(nums, nums.length - k);
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {5,4,1,2,2};

        // 将所有奇数分配给另一数组，O(n)
        List<Integer> arrayList= new ArrayList<>();
        for (int num: arr) {
            if(num%2==1){
                arrayList.add(num);
            }
        }
        int size = arrayList.size();
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = arrayList.get(i);
        }

        int k = 2;  //第k大的奇数
        // 切分元素
        int ans = findKthLargest(newArray, k);
        System.out.println(ans);

    }


}
