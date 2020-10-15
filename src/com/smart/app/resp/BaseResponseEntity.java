package com.smart.app.resp;

/*
    此类用于JSON数据生成
    也是服务器返回给前端的状态信息
    根据响应层的调用决定返回给服务器什么状态信息！~
    */
//Ajax是一种方法，功能是不用重载网页情况下的部分数据更新，不是数据格式，你个傻逼

//404 资源部存在
// 40001  用户已存在
// 40002 注册失败
// 40004 服务器繁忙! 请稍后再试


public class BaseResponseEntity<T> {
    private int status;
    private String msg;
    private T data;

    /*public static <T> BaseResponseEntity<T> success(T data) {
        BaseResponseEntity baseResponseEntity = new BaseResponseEntity();
        baseResponseEntity.setStatus(200);
        baseResponseEntity.setMsg("chengong");
        baseResponseEntity.setData(data);
        return baseResponseEntity;
    }*/

    public static <T> BaseResponseEntity<T> success(T data) {
        return success(200, "success", data);
    }


    public static <T> BaseResponseEntity success(int status, String msg, T data) {
        BaseResponseEntity baseResponseEntity = new BaseResponseEntity();
        baseResponseEntity.setStatus(status);
        baseResponseEntity.setMsg(msg);
        baseResponseEntity.setData(data);
        return baseResponseEntity;
    }

    public static <T> BaseResponseEntity error() {
        return error(404, "error");
    }

    public static <T> BaseResponseEntity error(int status, String msg) {
        BaseResponseEntity baseResponseEntity = new BaseResponseEntity();
        baseResponseEntity.setStatus(status);
        baseResponseEntity.setMsg(msg);
        return baseResponseEntity;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}