package com.beisiji.design_pattern.abstractfactory.example1;

/**
 * Created by beisiji on 2019/7/31.
 * 抽象工厂
 */
public interface AbstractFactory {

    /**
     * 创建抽象产品A对象
     * @return
     */
    AbstractProductA createProductA();

    /**
     * 创建抽象产品B对象
     * @return
     */
    AbstractProductB createProductB();
}
