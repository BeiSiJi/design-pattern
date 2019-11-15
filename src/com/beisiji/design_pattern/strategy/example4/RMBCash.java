package com.beisiji.design_pattern.strategy.example4;

/**
 * Created by yuanlb on 2019/1/22.
 * 人民币现金支付
 */
public class RMBCash implements PaymentStrategy {

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给"+ctx.getUserName()+"人民币现金支付"+ctx.getMoney()+"元");
    }
}