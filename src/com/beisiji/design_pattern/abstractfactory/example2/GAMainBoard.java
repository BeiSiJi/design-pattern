package com.beisiji.design_pattern.abstractfactory.example2;

/**
 * Created by beisiji on 2019/7/31.
 */
public class GAMainBoard implements MainBoardApi {

    /**
     * cpu插槽孔数
     */
    private int cpuHoles = 0;

    public GAMainBoard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println("GAMainBoard install cpu , cpuHoles = " + cpuHoles);
    }
}
