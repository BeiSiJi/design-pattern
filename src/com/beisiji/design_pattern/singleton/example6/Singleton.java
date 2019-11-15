package com.beisiji.design_pattern.singleton.example6;

/**
 * Created by beisiji on 2019/8/2.
 */
public enum Singleton {


    INSTANCE;

    private Resource resource;

    Singleton() {
        this.resource = new Resource();
    }

    public Resource getInstance(){
        return resource;
    }


}

class Resource{

}
