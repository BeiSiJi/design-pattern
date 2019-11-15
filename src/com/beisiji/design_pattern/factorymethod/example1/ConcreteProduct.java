package com.beisiji.design_pattern.factorymethod.example1;

/**
 * Created by beisiji on 2019/5/12.
 */
public class ConcreteProduct implements  Product{
    @Override
    public void foo() {
        System.out.println(this.getClass().getSimpleName());
    }
}
