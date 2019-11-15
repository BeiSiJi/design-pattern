package com.beisiji.design_pattern.prototype.example3;

/**
 * Created by beisiji on 2019/11/15.
 */
public class ConcreateOrderPrototype extends OrderPrototype implements Cloneable {


    public ConcreateOrderPrototype(String id, ProductPrototype productPrototype) {
        super(id, productPrototype);
    }

    @Override
    public OrderPrototype cloneOrder() {
        OrderPrototype orderPrototype = null;
        try {
            orderPrototype = (OrderPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return orderPrototype;
    }
}
