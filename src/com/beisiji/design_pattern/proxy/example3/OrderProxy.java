package com.beisiji.design_pattern.proxy.example3;

/**
 * Created by beisiji on 2019/8/2.
 */
public class OrderProxy implements OrderApi {

    private Order order = null;

    public OrderProxy(Order order) {
        this.order = order;
    }


    @Override
    public void setProductName(String productName, String user) {
        if(user != null && user.equals(this.getOrderUser())){
            order.setProductName(productName,user);
        }else{
            System.out.println("对不起" + user + "，您没有修改订单中产品的权限");
        }
    }


    @Override
    public void setOrderNum(int orderNum, String user) {
        if(user != null && user.equals(this.getOrderUser())){
            order.setOrderNum(orderNum,user);
        }else{
            System.out.println("对不起" + user + "，您没有修改数量的权限");
        }
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if(user != null && user.equals(this.getOrderUser())){
            order.setOrderUser(orderUser,user);
        }else{
            System.out.println("对不起" + user + "，您没有修改订购人的权限");
        }
    }

    @Override
    public String getProductName() {
        return this.order.getProductName();
    }


    @Override
    public int getOrderNum() {
        return this.order.getOrderNum();
    }


    @Override
    public String getOrderUser() {
        return this.order.getOrderUser();
    }


}
