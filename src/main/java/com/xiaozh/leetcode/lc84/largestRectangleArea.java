package com.xiaozh.leetcode.lc84;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class largestRectangleArea {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    public static int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0) return 0;
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        // 单调栈
        for(int i = 0; i<= heights.length; i++){
            int cur = (i<heights.length) ? heights[i] : -1;
            while(!stack.isEmpty() && cur <= heights[stack.peek()]){
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i -stack.peek() - 1; //when i = 0, stack is empty. or when i = 5, w = heights.length
                res = Math.max(res, h*w);
            }
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] heights = stringToIntegerArray(line);

            int ret = largestRectangleArea(heights);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}