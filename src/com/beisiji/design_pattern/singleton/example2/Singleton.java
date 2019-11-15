package com.beisiji.design_pattern.singleton.example2;

/**
 * Created by beisiji on 2019/8/2.
 * 懒汉式，双重校验加锁保证线程安全
 */
public class Singleton {

    //对实例变量的引用增加volatile修饰，确保多线程从共享内存读取数据，并禁止指令重拍
    private volatile static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance(){
        //先检查实例是否存在，如果不存在进入下面的同步代码块
        if(instance == null){
            //同步块，线程安全的创建实例
            synchronized (Singleton.class){
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
