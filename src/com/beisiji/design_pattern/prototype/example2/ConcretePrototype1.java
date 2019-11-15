package com.beisiji.design_pattern.prototype.example2;

/**
 * Created by beisiji on 2019/11/15.
 */
public class ConcretePrototype1 extends Prototype {

    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype1(this.getId());
        return prototype;
    }
}
