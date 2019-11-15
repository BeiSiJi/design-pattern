package com.beisiji.design_pattern.proxy.example5;

/**
 * Created by beisiji on 2019/8/2.
 */
public class Client {

    public static void main(String[] args) {
        Order order = new Order("设计模式",100,"张三");

        DynamicProxy dynamicProxy = new DynamicProxy();
        OrderApi orderApi = dynamicProxy.getProxyInterface(order);
        orderApi.setOrderNum(33,"王五");
        orderApi.setOrderNum(11,"张三");
    }
}
