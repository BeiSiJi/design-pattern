package com.beisiji.design_pattern.state.example2;

/**
 * Created by yuanlb on 2019/1/22.
 * 封装与Context的一个特定状态相关的行为
 */

@FunctionalInterface
public interface State {

    /**
     * 状态对应的处理
     */
    void handle(Object ... objs);
}