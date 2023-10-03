package com.xlyl.common.resp;

import java.util.List;

/**
 * @version 1.0
 * @Author 晓路言路
 * @注释 统一的返回结果类
 */
public class CommonResp<T> {

    private boolean success = true;

    private String message;

    private T content;

    public CommonResp() {
    }

    public CommonResp(T content) {
        this.content = content;
    }

    public CommonResp(boolean success, String message, T content) {
        this.success = success;
        this.message = message;
        this.content = content;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "CommonResp{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", content=" + content +
                '}';
    }
}
