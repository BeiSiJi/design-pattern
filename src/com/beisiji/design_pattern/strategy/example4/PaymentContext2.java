package com.beisiji.design_pattern.strategy.example4;

/**
 * Created by yuanlb on 2019/1/22.
 */
public class PaymentContext2 extends PaymentContext {

    private String account;

    public String getAccount() {
        return account;
    }

    /**
     * 构造方法，传入被支付工资的人员，应支付的金额和具体的支付策略
     *
     * @param userName 被支付工资的人员
     * @param money    应支付的金额
     * @param strategy 具体的支付策略
     */
    public PaymentContext2(String userName, double money, PaymentStrategy strategy, String account) {
        super(userName, money, strategy);
        this.account = account;
    }
}