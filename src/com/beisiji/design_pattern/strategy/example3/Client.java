package com.beisiji.design_pattern.strategy.example3;

/**
 * Created by yuanlb on 2019/1/22.
 * 客户端
 */
public class Client {

    private static final String QUOTE = "quote = %s";

    public static void main(String[] args) {

        //新客户或者是普通客户报价算法类
        NormalCustomerStrategy normalCustomerStrategy = new NormalCustomerStrategy();
        double quote = new PriceContext(normalCustomerStrategy).quote(1000d);
        System.out.println(String.format(QUOTE, quote));

        //老客户报价算法类
        OldCustomerStrategy oldCustomerStrategy = new OldCustomerStrategy();
        quote = new PriceContext(oldCustomerStrategy).quote(1000d);
        System.out.println(String.format(QUOTE, quote));

        //匿名类
        quote = new PriceContext(new Stragegy() {
            @Override
            public double calcPrice(double goodsPrice) {
                return goodsPrice * 0.5d;
            }
        }).quote(1000D);
        System.out.println(String.format(QUOTE, quote));

        //lmada策略
        quote = new PriceContext((d) ->
                d - 300d).quote(1000d);
        System.out.println(String.format(QUOTE, quote));

    }
}