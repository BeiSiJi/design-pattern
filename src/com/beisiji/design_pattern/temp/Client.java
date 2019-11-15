package com.beisiji.design_pattern.temp;

/**
 * Created by yuanlb on 2019/1/23.
 */
public class Client {

    public static void main(String[] args) {
        BaseTempObj baseTempObj = new BaseTempObj();

        baseTempObj.foo(100L, new CallBack() {
            @Override
            public Double foo(Double l) {
                return l - 10L;
            }
        });

        baseTempObj.foo(100L, new CallBack() {
            @Override
            public Double foo(Double l) {
                return l * 0.5;
            }
        });

        baseTempObj.foo(200L,x -> 2 * x);
    }
}