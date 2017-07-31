package com.example.demo.model;

public class MddOrderState {
    private String orderSn;
    private int orderState; //订单状态 0待确认 1 完成 2待指派 3待付款 4等待报告 5服务中 6报告待翻译 7 报告完成 8作废 9 未预约 ,

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }
}
