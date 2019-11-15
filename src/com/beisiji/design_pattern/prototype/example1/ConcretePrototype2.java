package com.beisiji.design_pattern.prototype.example1;

/**
 * Created by beisiji on 2019/11/15.
 */
public class ConcretePrototype2 implements Prototype {
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype2();
        return prototype;
    }
}
