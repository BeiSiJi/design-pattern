package com.beisiji.design_pattern.prototype.example2;

/**
 * Created by beisiji on 2019/11/15.
 */
public class Client {

    /**
     * 通过原型模式，调用clone方法后修改新创建的原型对象后，对原来的原型对象没有影响
     * @param args
     */
    public static void main(String[] args) {
        Prototype prototype = new ConcreatePrototype2("bei");
        System.out.println("prototype, id = " + prototype.getId());

        Prototype clonePrototype = prototype.clone();
        clonePrototype.setId("yuan");
        System.out.println("clone prototype, id = " + clonePrototype.getId());

        System.out.println("old prototype, id =" + prototype.getId());
    }
}
