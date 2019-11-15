package com.beisiji.design_pattern.proxy.example4;


/**
 * Created by beisiji on 2019/8/2.
 */
public class OrderProxy extends Order {


    public OrderProxy(String productName, int orderNum, String orderUser) {
        super(productName, orderNum, orderUser);
    }


    @Override
    public void setProductName(String productName, String user) {
        if(user != null && user.equals(this.getOrderUser())){
            super.setProductName(productName,user);
        }else{
            System.out.println("对不起" + user + "，您没有修改订单中产品的权限");
        }
    }


    @Override
    public void setOrderNum(int orderNum, String user) {
        if(user != null && user.equals(this.getOrderUser())){
            super.setOrderNum(orderNum,user);
        }else{
            System.out.println("对不起" + user + "，您没有修改数量的权限");
        }
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if(user != null && user.equals(this.getOrderUser())){
            super.setOrderUser(orderUser,user);
        }else{
            System.out.println("对不起" + user + "，您没有修改订购人的权限");
        }
    }

    @Override
    public String getProductName() {
        return super.getProductName();
    }


    @Override
    public int getOrderNum() {
        return super.getOrderNum();
    }


    @Override
    public String getOrderUser() {
        return super.getOrderUser();
    }


}
