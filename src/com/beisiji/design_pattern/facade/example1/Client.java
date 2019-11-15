package com.beisiji.design_pattern.facade.example1;

/**
 * Created by beisiji on 2019/11/5.
 */
public class Client {

    public static void main(String[] args) {
        //使用外观模式前，需要逐个调用方法，操作复杂
//        AModuleApi a = new AModuleImpl();
//        BModuleApi b = new BModuleImpl();
//        CModuleApi c = new CModuleImpl();
//
//        a.aModuleOperate();
//        b.bModuleOperate();
//        c.cModuleOperate();

        //使用外观模式后，只需要调用外观类的方法，操作简单
        Facade facade = new Facade();
        facade.facadaMethod();
    }
}
