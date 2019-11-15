package com.beisiji.design_pattern.proxy.example2;

import java.util.List;

/**
 * Created by beisiji on 2019/8/2.
 * 虚代理
 * 根据需要来创建开销很大的对象，该对象只有在需要的时候才会被真正创
 */
public class Client {

    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        List<UserModelApi> result = userManager.getResult();
        for (UserModelApi i : result) {
            System.out.println("userinfo, userId = " + i.getUserId() + ", name = " + i.getName());
        }
        for (UserModelApi i : result) {
            System.out.println("userinfo, userId = " + i.getUserId() + ", name = " + i.getName() + ", sex = " + i.getSex() + " , deptId = " + i.getDeptId());
        }
    }
}
