package com.itheima.pratice.YC;
// TODO 自定义异常类（运行时异常）  继承RuntimeException
public class BusinessException extends RuntimeException {
    private int code;
    private String message;

    public BusinessException() {
    }

    public BusinessException(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
