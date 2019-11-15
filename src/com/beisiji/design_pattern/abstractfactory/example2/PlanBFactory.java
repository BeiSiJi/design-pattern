package com.beisiji.design_pattern.abstractfactory.example2;

/**
 * Created by beisiji on 2019/7/31.
 * 计划B装机方案
 */
public class PlanBFactory implements AbstractFactory {
    @Override
    public CPUApi createCpu() {
        return new AMDCPU(222);
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new MSIMainBoard(4);
    }
}
