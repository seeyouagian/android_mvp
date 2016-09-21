package com.xiaobai.demo.model;

/**
 * Created by xiaobai on 16/7/5.
 */
public class HttpRespone<T> {
    /**
     * code : 200
     * message :
     * success : true
     */

    private int code;
    private String message;
    private boolean success;



    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    //用来模仿Data
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
