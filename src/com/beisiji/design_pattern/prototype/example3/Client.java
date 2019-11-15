package com.beisiji.design_pattern.prototype.example3;

/**
 * Created by beisiji on 2019/11/15.
 * 通过object中的clone来进行原型对象的深度拷贝
 */
public class Client {

    public static void main(String[] args) {
        ProductPrototype product = new ConcreateProductPrototype("iphone");
        OrderPrototype order = new ConcreateOrderPrototype("yuan",product);
        OrderPrototype newOrder = order.cloneOrder();
        newOrder.setId("liubei");

        System.out.println("order = " + order);
        System.out.println("newOrder = " + newOrder);

    }
}
