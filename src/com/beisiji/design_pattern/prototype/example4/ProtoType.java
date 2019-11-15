package com.beisiji.design_pattern.prototype.example4;

/**
 * Created by beisiji on 2019/11/15.
 */
public abstract class ProtoType {

    private String name;

    public ProtoType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract ProtoType clonePrototype();

    @Override
    public String toString() {
        return "ProtoType{" +
                "name='" + name + '\'' +
                '}';
    }
}
