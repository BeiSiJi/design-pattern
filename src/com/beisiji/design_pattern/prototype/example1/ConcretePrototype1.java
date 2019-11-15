package com.beisiji.design_pattern.prototype.example1;

/**
 * Created by beisiji on 2019/11/15.
 * 克隆的具体实现对象
 */
public class ConcretePrototype1 implements Prototype {


    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1();
        return prototype;
    }
}
