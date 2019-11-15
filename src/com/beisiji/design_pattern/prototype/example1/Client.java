package com.beisiji.design_pattern.prototype.example1;

/**
 * Created by beisiji on 2019/11/15.
 * 使用原型的客户端
 */
public class Client {

    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    /**
     * 实例方法，执行某个操作
     */
    public void operation(){
        //会需要创建原型接口的对象
        Prototype newPrototype = prototype.clone();
    }
}
