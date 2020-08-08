package com.xiaozh.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class lc20_ValidParentheses {
    private static boolean isValid(String s){
        Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')','(');
        mappings.put(']','[');
        mappings.put('}','{');

        char[] charStr = s.toCharArray();
        int len = s.length();
        Deque<Character> stack = new LinkedList<>();
        //进栈出栈
        for(int i = 0; i<len; i++){
            char c = charStr[i];
            if( c=='(' || c=='{' || c=='[' ){
                stack.addFirst(c);
            } else if ( c==')' || c=='}' || c==']'  ){
                if(!stack.isEmpty()){
                    char tmp = stack.peekFirst();
                    if(tmp == mappings.get(c)){
                        stack.removeFirst();
                    }else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "]";
        boolean valid = isValid(str);
        System.out.println(valid);
    }
}
