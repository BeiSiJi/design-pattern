package com.beisiji.design_pattern.proxy.example2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by beisiji on 2019/8/2.
 */
public class UserManager {

    /***
     * 模仿去数据库查询用户的基本信息
     * @return
     */
    public List<UserModelApi> getResult(){
        List<UserModelApi> result = new LinkedList<>();
        UserModelApi model = null;
        for(int i = 0;i <= 10;i++){
            model = new Proxy(new UserModle());
            model.setUserId(String.valueOf(i));
            model.setName("name"+i);
            result.add(model);
        }
        return result;
    }

}
