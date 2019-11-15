package com.beisiji.design_pattern.singleton.example6;

/**
 * Created by beisiji on 2019/8/2.
 */
public class Client {

    public static void main(String[] args) {
        Resource instancea = Singleton.INSTANCE.getInstance();
        Resource instanceb = Singleton.INSTANCE.getInstance();
        System.out.println("instancea = " + instancea);
        System.out.println("instanceb = " + instanceb);
        System.out.println(instancea.equals(instanceb));
    }
}
