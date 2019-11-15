package com.beisiji.design_pattern.abstractfactory.example2;

/**
 * Created by beisiji on 2019/7/31.
 * 计划A装机方案
 */
public class PlanAFactory implements AbstractFactory {


    @Override
    public CPUApi createCpu() {
        return new IntelCPU(234);
    }

    @Override
    public MainBoardApi createMainBoard() {
        return new GAMainBoard(3);
    }
}
