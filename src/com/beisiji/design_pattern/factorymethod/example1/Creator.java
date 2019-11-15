package com.beisiji.design_pattern.factorymethod.example1;

/**
 * Created by beisiji on 2019/5/12.
 */
public abstract class Creator {

    /**
     * 创建Product的工厂方法
     * @return
     */
    protected abstract Product factoryMethod();

    /**
     * 示意方法，实现某些功能的方法
     */
    public final void foo(){
        //通常在这些方法实现中，需要调用工厂方法来获取product对象
        Product product = factoryMethod();
        product.foo();
    }
}
