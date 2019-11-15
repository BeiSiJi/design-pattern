package com.beisiji.design_pattern.factorymethod.example1;

/**
 * Created by beisiji on 2019/5/12.
 */
public class ConcreteCreator extends Creator {

    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
