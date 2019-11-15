package com.beisiji.design_pattern.abstractfactory.example2;

/**
 * Created by beisiji on 2019/7/31.
 */
public class MSIMainBoard implements MainBoardApi {

    private int cpuHoles = 0;

    public MSIMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("msi mainBoard install cpu, cpuHoles ="+cpuHoles);
    }
}
