package com.beisiji.design_pattern.strategy.example3;

/**
 * Created by yuanlb on 2019/1/22.
 * 具体算法实现，为战略合作客户客户计算应报的价格
 */
public class CooperateCustomerStrategy implements Stragegy{

    /**
     * @param goodsPrice 商品销售原价
     * @return
     */
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于战略合作客户，统一8折");
        return goodsPrice*0.8;
    }
}