package com.beisiji.design_pattern.abstractfactory.example2;

/**
 * Created by beisiji on 2019/7/31.
 * 客户端
 */
public class Client {


    public static void main(String[] args) {
        ComputerEngineer computerEngineer = new ComputerEngineer();
        AbstractFactory factory = new PlanAFactory();
        computerEngineer.makeCompulter(factory);
    }
}
