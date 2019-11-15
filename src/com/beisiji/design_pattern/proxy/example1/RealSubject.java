package com.beisiji.design_pattern.proxy.example1;

/**
 * Created by beisiji on 2019/8/2.
 * 具体的目标对象，实现真正的目标功能
 */
public class RealSubject implements Subject {


    @Override
    public void request() {
        //执行具体的功能处理
    }
}
