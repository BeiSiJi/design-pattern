package com.beisiji.design_pattern.proxy.example3;

/**
 * Created by beisiji on 2019/8/2.
 */
public interface OrderApi {

    String getProductName();

    void setProductName(String productName,String user);


    int getOrderNum();

    void setOrderNum(int orderNum,String user);

    String getOrderUser();

    void setOrderUser(String orderUser,String user);


}
