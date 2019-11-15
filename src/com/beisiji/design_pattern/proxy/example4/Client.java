package com.beisiji.design_pattern.proxy.example4;

/**
 * Created by beisiji on 2019/8/2.
 * 不需要代理类
 */
public class Client {

    public static void main(String[] args) {
        Order order = new OrderProxy("设计模式", 1, "张三");
        order.setOrderNum(33,"王五");
        order.setOrderNum(11,"张三");
    }
}
