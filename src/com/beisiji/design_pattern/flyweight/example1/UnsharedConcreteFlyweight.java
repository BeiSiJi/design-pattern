package com.beisiji.design_pattern.flyweight.example1;

/**
 * Created by beisiji on 2019/8/5.
 * 非共享的享元对象
 * 通常是将被共享的享元对象作为子节点
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    //描述对象的状态
    private String status;


    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理
    }
}
