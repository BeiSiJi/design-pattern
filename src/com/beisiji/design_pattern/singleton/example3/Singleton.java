package com.beisiji.design_pattern.singleton.example3;

/**
 * Created by beisiji on 2019/8/2.
 * 懒汉式，是线程安全的，但是每次获取对象都需要同步，效率不高
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            return instance = new Singleton();
        }
        return instance;
    }

}
