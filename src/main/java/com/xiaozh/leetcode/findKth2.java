package com.xiaozh.leetcode;

/**
 * 找到第k大的奇数
 * */
public class findKth2 {
    public static int findKth(int[] arr,int k) {
        //对数组进行排序
        if(arr!=null){
            for (int i = 0; i <arr.length-1; i++) {
                for (int j = 0; j <arr.length-1-i; j++) {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        //思路就是直接从排序的数组中找奇数
        //我们遍历数组，这个a就是第几个小的奇数，然后每次都与k比较，如果是就返回
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 1){//说明是个奇数
                if(a==k){ //如果第a小的数是想要k，那么就可以返回了
                    return arr[i];
                }
                a++;
            }
        }

        // 返回结果
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,3,5,6};  // 定义一个数组
        int k = 3;
        System.out.println(findKth(arr, k));  // 调用定义好的排序方法
    }

}

