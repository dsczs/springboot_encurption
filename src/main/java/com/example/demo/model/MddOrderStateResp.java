package com.example.demo.model;

import java.util.List;

public class MddOrderStateResp {
    private int statusCode;
    private String msg;
    private String msgEN;
    private boolean success;
    private List<MddOrderState> data;

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsgEN() {
        return msgEN;
    }

    public void setMsgEN(String msgEN) {
        this.msgEN = msgEN;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<MddOrderState> getData() {
        return data;
    }

    public void setData(List<MddOrderState> data) {
        this.data = data;
    }
}
