package com.beisiji.design_pattern.facade.example1;

/**
 * Created by beisiji on 2019/11/5.
 */
public class Facade {

    public void facadaMethod(){
        AModuleApi a = new AModuleImpl();
        BModuleApi b = new BModuleImpl();
        CModuleApi c = new CModuleImpl();

        a.aModuleOperate();
        b.bModuleOperate();
        c.cModuleOperate();
    }
}
