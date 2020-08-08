package com.xiaozh.basic.Generic;

public class testT {
    public static void main(String[] args) {
        int data = 5;
        Result<Integer> integerResult = defaultSuccess(data);
        System.out.println(integerResult);
    }
    public static <T> Result<T> defaultSuccess(T data){
        return new Result<T>(data, true, 200, "返回成功");
    }

}
