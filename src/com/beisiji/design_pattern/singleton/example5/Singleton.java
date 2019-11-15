package com.beisiji.design_pattern.singleton.example5;

/**
 * Created by beisiji on 2019/8/2.
 */
public class Singleton {

    private Singleton() {
    }

    //只有第一次被引用时，才会加载到虚拟机，从而保证了延迟加载
    private static class SingletonHolder{
        //通过类加载机制来保证线程安全
        private static Singleton instance = new Singleton();
    }


    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
