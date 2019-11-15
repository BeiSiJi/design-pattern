package com.beisiji.design_pattern.singleton.example1;

/**
 * Created by beisiji on 2019/8/2.
 * 懒汉单例，存在线程安全问题
 */
public class Singleton {

    //4.定义一个变量来存储创建好的类实例
    //5.因为这个变量在静态方法中使用，加上static修饰
    private static Singleton instance = null;


    //1.私有化构造器，好在内部控制创建实例的数目
    private Singleton() {
    }


    //2.定义一个方法来为客户端提供类实例
    //3.这个方法需要定义成类方法
    public static Singleton getInstance(){
        //6.判断存储实例的变量是否有值
        if(instance == null){
            //6.1 如果没有，就创建一个类实例，并把这个值复制给存储类实例的变量
            instance = new Singleton();
        }
        //6.2 如果有值，就直接使用
        return instance;
    }
}
