package com.beisiji.design_pattern.proxy.example1;

/**
 * Created by beisiji on 2019/8/2.
 * 代理对象
 */
public class Proxy implements Subject {

    //持有被代理的具体目标对象
    private RealSubject realSubject = null;

    //构造方法，传入被代理的具体的目标对象
    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        //在转调具体的目标对象前，执行一些功能处理

        //转调具体的目标对象的方法
        realSubject.request();

        //在转调具体的目标对象后，执行一些功能处理
    }
}
