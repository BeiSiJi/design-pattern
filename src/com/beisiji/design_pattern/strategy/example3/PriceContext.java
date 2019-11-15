package com.beisiji.design_pattern.strategy.example3;

/**
 * Created by yuanlb on 2019/1/22.
 * 价格计算环境类
 */
public class PriceContext {

    /**
     * 具体策略对象的引用
     */
    private Stragegy stragegy;

    /**
     * 传递具体的策略对象
     * @param stragegy
     */
    public PriceContext(Stragegy stragegy) {
        this.stragegy = stragegy;
    }


    /**
     * 计算不同客户所有货物的报价
     * @param goodsPrice
     * @return
     */
    public final double quote(double goodsPrice){
        return this.stragegy.calcPrice(goodsPrice);
    }
}