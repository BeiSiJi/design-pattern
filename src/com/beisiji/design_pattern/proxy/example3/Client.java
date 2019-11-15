package com.beisiji.design_pattern.proxy.example3;

/**
 * Created by beisiji on 2019/8/2.
 */
public class Client {

    public static void main(String[] args) {
        OrderApi order = new OrderProxy(new Order("设计模式", 1, "张三"));
        order.setOrderNum(33,"王五");
        order.setOrderNum(11,"张三");
    }
}
