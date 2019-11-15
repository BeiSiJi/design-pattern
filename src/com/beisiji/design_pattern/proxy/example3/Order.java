package com.beisiji.design_pattern.proxy.example3;

/**
 * Created by beisiji on 2019/8/2.
 */
public class Order implements OrderApi {

    private String productName;

    private int orderNum;

    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public void setProductName(String productName, String user) {
        this.productName = productName;
    }

    @Override
    public int getOrderNum() {
        return this.orderNum;
    }

    @Override
    public void setOrderNum(int orderNum, String user) {
        this.orderNum = orderNum;
    }

    @Override
    public String getOrderUser() {
        return this.orderUser;
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        this.orderUser = orderUser;
    }
}
