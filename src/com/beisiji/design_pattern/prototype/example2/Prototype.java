package com.beisiji.design_pattern.prototype.example2;

/**
 * Created by beisiji on 2019/11/15.
 * 抽象原型类
 */
public abstract class Prototype {

    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    /**
     * 克隆自身的方法
     * @return
     */
    public abstract Prototype clone();
}
