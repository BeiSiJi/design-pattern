package com.beisiji.design_pattern.flyweight.example3;

/**
 * Created by beisiji on 2019/11/5.
 */
public class Client {
    public static void main(String[] args) {
        SecurityMgr mgr = SecurityMgr.getInstance();
        mgr.login("张三");
        mgr.login("李四");
        boolean f1 = mgr.hasPermit("张三","薪资数据","查看");
        boolean f2 = mgr.hasPermit("李四","薪资数据","查看");
        boolean f3 = mgr.hasPermit("李四","薪资数据","修改");

        System.out.println("f1=="+f1);
        System.out.println("f2=="+f2);
        System.out.println("f3=="+f3);
    }
}
