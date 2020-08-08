package com.xiaozh.leetcode;

import java.util.Scanner;
/**
 * 快速排序的流程：
 * 1. pivot：partition
 * 2.
 * */
public class NC_SortQuick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int[] arr = new int[data.length];
        for(int i = 0; i< data.length; i++){
            arr[i] = Integer.parseInt(data[i]);
        }

        int j = partition(arr, 0, arr.length-1);
        System.out.println(j);
//        Qsort(arr, 0, arr.length-1);
        for(int num: arr) System.out.print(num + " ");

    }

    public static int partition(int[] arr, int low, int high){
        int pivot= arr[low];
        int i = low; int j = high + 1;
        while(true){
            while(arr[++i] < pivot) {
                if(i == high) break;
            }
            while(arr[--j] > pivot){
                if(j == low) break;
            }
            if(i>=j) break;
            swap(arr, i, j);
        }
        swap(arr, j, low);
        return j;
    }

    public static void  Qsort(int[] arr, int low, int high){
        if(high <= low) return;
        int j = partition(arr, low, high);
        Qsort(arr, low, j-1);
        Qsort(arr, j+1, high);
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
