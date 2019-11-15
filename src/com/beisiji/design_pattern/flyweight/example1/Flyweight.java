package com.beisiji.design_pattern.flyweight.example1;

/**
 * Created by beisiji on 2019/8/5.
 * 享元接口，通过这个接口享元可以接受并作用于外部状态
 */
public interface Flyweight {


    /**
     * 示例操作，传入外部状态
     * @param extrinsicState
     */
    void operation(String extrinsicState);
}
