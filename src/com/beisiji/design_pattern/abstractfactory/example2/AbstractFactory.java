package com.beisiji.design_pattern.abstractfactory.example2;

/**
 * Created by beisiji on 2019/7/31.
 * 抽象工厂
 */
public interface AbstractFactory {


    /**
     * 创建cpu对象
     * @return
     */
    CPUApi createCpu();

    /**
     * 创建主板对象
     * @return
     */
    MainBoardApi createMainBoard();
}
