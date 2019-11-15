package com.beisiji.design_pattern.prototype.example4;

/**
 * Created by beisiji on 2019/11/15.
 */
public class ConcreatePrototype1 extends ProtoType {


    public ConcreatePrototype1(String name) {
        super(name);
    }

    @Override
    public ProtoType clonePrototype() {
        ProtoType protoType = new ConcreatePrototype1(this.getName());
        return protoType;
    }
}
