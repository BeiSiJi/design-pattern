package com.beisiji.design_pattern.state.example5;

/**
 * Created by yuanlb on 2019/1/22.
 * 具体状态类的公共接口
 */

@FunctionalInterface
public interface State {

    /**
     * 执行状态对应的功能处理
     * @param stateMechine
     */
    void doWork(StateMechine stateMechine);
}