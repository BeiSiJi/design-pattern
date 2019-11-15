package com.beisiji.design_pattern.template;

/**
 * Created by yuanlb on 2019/1/23.
 */
public abstract class Template {


    protected final Object tempFun(Object... objs) {
        this.checkFirst(objs);
        this.absFun(objs);
        this.foo(objs);
        return null;
    }


    protected abstract void absFun(Object ... objs);


    //不可覆盖，子类通用默认的行为
    protected final void checkFirst(Object ... objs){
        for (Object obj : objs) {
            if(obj ==  null){
                throw new IllegalArgumentException("");
            }
        }
    }

    //可覆盖，子类覆盖拓展属于自己的行为
    protected void foo(Object ... objs){
        System.out.println("objs = " + objs);
    }
}