package com.mayaoting.springcloud.common;

public class CommonResult<T> {
    private String code;
    private String Message;
    private T data;

    public CommonResult(){
        super();
    }

    public CommonResult(String code,String message){
        this(code,message,null);
    }

    public CommonResult(String code, String message, T data) {
        this.code = code;
        this.Message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
