package com.beisiji.design_pattern.simplefactory.example2;

/**
 * Created by beisiji on 2019/5/12.
 * 模拟客户端
 */
public class Client {

    public static void main(String[] args) {
        Api api = Factory.createApi();
        api.foo();

        System.out.println("------------------");

    }
}
