package com.beisiji.design_pattern.prototype.example1;

/**
 * Created by beisiji on 2019/11/15.
 * 申明一个克隆自身的接口
 */
public interface Prototype {

    /**
     * 克隆自身的方法
     * @return
     */
    Prototype clone();
}
