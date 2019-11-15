package com.beisiji.design_pattern.temp;

/**
 * Created by yuanlb on 2019/1/23.
 */
public class BaseTempObj {


    public Double foo(Long l,CallBack callBack){
        double v = l.doubleValue();
        System.out.println("开始，obj = " + v);

        Double result = callBack.foo(v);

        System.out.println("结束，obj = " + result);
        return result;
    }
}