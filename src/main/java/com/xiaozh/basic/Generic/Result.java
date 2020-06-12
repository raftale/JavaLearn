package com.xiaozh.basic.Generic;

import java.io.Serializable;

public class Result<T> implements Serializable {
    private T data;
    private boolean success;
    private int code;
    private String message;

    public Result(T data, boolean success, int code, String message) {
        this.data = data;
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Result{" +
                "data=" + data +
                ", success=" + success +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
}
