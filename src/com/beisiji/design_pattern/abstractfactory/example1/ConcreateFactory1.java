package com.beisiji.design_pattern.abstractfactory.example1;

/**
 * Created by beisiji on 2019/7/31.
 * 具体工厂，定义实现一系列产品对象的创建
 */
public class ConcreateFactory1 implements AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
