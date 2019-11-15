package com.beisiji.design_pattern.prototype.example2;

/**
 * Created by beisiji on 2019/11/15.
 */
public class ConcreatePrototype2 extends Prototype {

    public ConcreatePrototype2(String id) {
        super(id);
    }

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcreatePrototype2(this.getId());
        return prototype;
    }
}
