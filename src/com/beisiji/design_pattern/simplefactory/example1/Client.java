package com.beisiji.design_pattern.simplefactory.example1;

/**
 * Created by beisiji on 2019/5/12.
 * 模拟客户端
 */
public class Client {

    public static void main(String[] args) {
        Api api = Factory.createApi();
        api.foo();

        System.out.println("------------------");

        Api i = Factory.createApiByType(Factory.ApiTypeEnum.IMPA);
        i.foo();

        System.out.println("------------------");

        Api j = Factory.createApiByType(Factory.ApiTypeEnum.IMPB);
        j.foo();
    }
}
