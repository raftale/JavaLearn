package com.xiaozh.leetcode;


public class lc28_strStr {
    /**
     * https://leetcode-cn.com/problems/implement-strstr/solution/shi-xian-strstr-by-leetcode/
     * */
    public static int strStr(String haystack, String needle) {
        int lenNee = needle.length(), lenHay = haystack.length();
        if(lenNee == 0) return 0;

        int pN = 0;
        while(pN < lenHay - lenNee + 1){
            // find the position of the first needle character
            // in the haystack string
            while(pN < lenHay - lenNee + 1 && haystack.charAt(pN) != needle.charAt(0)) {
                pN++;
            }
            // compute the max match string
            int currLen = 0, pL = 0;
            while(pL < lenNee && pN < lenHay && haystack.charAt(pN) == needle.charAt(pL)){
                pN++;
                pL++;
                currLen++;
            }

            // if the whole needle string is found,
            // return its start position
            if(currLen == lenNee) return pN - lenNee;

            //otherwise, backtrack
            pN = pN - currLen + 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        String haystack = "Hello";
        String needle = "ll";
        int res = strStr(haystack, needle);
        System.out.println(res);
    }
}
