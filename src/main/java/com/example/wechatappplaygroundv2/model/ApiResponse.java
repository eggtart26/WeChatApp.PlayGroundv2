package com.example.wechatappplaygroundv2.model;

public class ApiResponse<T> {
    private int code;
    private T data;
    private String msg;


    public ApiResponse(int code, T data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;

    }

    // Getters and Setters
    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }


    // Static method for success
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(0, data, "success");
    }

    // Static method for error
    public static <T> ApiResponse<T> error(int code, String msg, UserAddressTesting userAddress) {
        return new ApiResponse<>(code, null, msg);
    }
}
