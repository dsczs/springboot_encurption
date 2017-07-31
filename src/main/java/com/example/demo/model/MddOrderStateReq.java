package com.example.demo.model;

import java.util.List;

public class MddOrderStateReq {
    private int userId;
    private List<String> orderSn;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<String> getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(List<String> orderSn) {
        this.orderSn = orderSn;
    }
}
