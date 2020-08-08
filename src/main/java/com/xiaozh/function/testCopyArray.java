package com.xiaozh.function;

public class testCopyArray {
    private static void copyArray(int[] nums1, int [] nums2){

    }

    public static void main(String[] args) {

        int[] sourceArr = {1,2,3};
        int[] destArr = {4,5,6,7,8};
        System.arraycopy(sourceArr,0, destArr, 0, 3);
        for(int dest: destArr){
            System.out.print(dest+" ");
        }

     }
}
