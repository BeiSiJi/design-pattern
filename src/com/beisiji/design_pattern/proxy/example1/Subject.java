package com.beisiji.design_pattern.proxy.example1;

/**
 * Created by beisiji on 2019/8/2.
 * 抽象的目标接口，定义具体的目标对象和代理公共的接口
 */
public interface Subject {

    /**
     * 一个请求方法
     */
    void request();
}
