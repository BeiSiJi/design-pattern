package com.beisiji.design_pattern.prototype.example4;

/**
 * Created by beisiji on 2019/11/15.
 */
public class ConcreatePrototype2 extends ProtoType {

    public ConcreatePrototype2(String name) {
        super(name);
    }

    @Override
    public ProtoType clonePrototype() {
        return new ConcreatePrototype2(this.getName());
    }
}
