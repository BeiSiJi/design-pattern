package com.beisiji.design_pattern.abstractfactory.example2;

/**
 * Created by beisiji on 2019/7/31.
 */
public class IntelCPU implements CPUApi {

    /**
     * 指针数
     */
    private int pins = 0;

    public IntelCPU(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("inter cpu calculate , pins = " + pins);
    }
}
