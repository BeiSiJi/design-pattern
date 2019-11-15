package com.beisiji.design_pattern.abstractfactory.example1;

/**
 * Created by beisiji on 2019/7/31.
 */
public class Client {

    public static void main(String[] args) {
        AbstractFactory factory = new ConcreateFactory1();
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();

    }
}
