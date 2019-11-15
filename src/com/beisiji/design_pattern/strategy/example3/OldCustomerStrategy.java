package com.beisiji.design_pattern.strategy.example3;

/**
 * Created by yuanlb on 2019/1/22.
 * 具体算法实现，为老客户计算应报的价格
 */
public class OldCustomerStrategy implements Stragegy {

    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于老客户，统一折扣5%");
        return goodsPrice*(1-0.05);
    }
}