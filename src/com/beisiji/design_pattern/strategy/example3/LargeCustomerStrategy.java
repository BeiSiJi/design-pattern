package com.beisiji.design_pattern.strategy.example3;

/**
 * Created by yuanlb on 2019/1/22.
 * 具体算法实现，为大客户计算应报的价格
 */
public class LargeCustomerStrategy implements Stragegy {

    /**
     *
     * @param goodsPrice 商品销售原价
     * @return
     */
    @Override
    public double calcPrice(double goodsPrice) {
        System.out.println("对于大客户，统一折扣10%");
        return goodsPrice*(1-0.1);
    }
}