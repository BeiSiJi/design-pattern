package com.beisiji.design_pattern.proxy.example4;

/**
 * Created by beisiji on 2019/8/2.
 */
public class Order {

    private String productName;

    private int orderNum;

    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName, String user) {
        this.productName = productName;
    }

    public int getOrderNum() {
        return this.orderNum;
    }

    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    public String getOrderUser() {
        return this.orderUser;
    }

    public void setOrderUser(String orderUser, String user) {
        this.orderUser = orderUser;
    }
}
