package com.beisiji.design_pattern.flyweight.example1;

/**
 * Created by beisiji on 2019/8/5.
 * 享元对象
 */
public class ConcreteFlyweight implements Flyweight {

    /**
     * 描述内部状态
     */
    private String intrinsicState;

    /**
     * 构造方法，传入享元对象的内部状态
     * @param intrinsicState
     */
    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理，可能会用到享元内部、外部的状态
    }
}
