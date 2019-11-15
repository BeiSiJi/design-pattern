package com.beisiji.design_pattern.proxy.example2;

/**
 * Created by beisiji on 2019/8/2.
 */
public class Proxy implements UserModelApi {

    private UserModle realSubject;


    private boolean loaded = false;

    public Proxy(UserModle realSubject) {
        this.realSubject = realSubject;
    }



    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }

    @Override
    public void setDeptId(String deptId) {
        realSubject.setDeptId(deptId);
    }


    @Override
    public String getDeptId() {
        if(!this.loaded){
            load();
            this.loaded = true;
        }
        return realSubject.getDeptId();
    }

    @Override
    public String getSex() {
        if(!this.loaded){
            load();
            this.loaded = true;
        }
        return realSubject.getDeptId();
    }


    //模仿去数据库加载用户的其他信息
    private void load(){
        Integer userId = Integer.valueOf(realSubject.getUserId());
        if(userId % 2 == 0){
            //偶数
            realSubject.setSex("男");
            realSubject.setDeptId("产品部");
        }else{
            realSubject.setSex("女");
            realSubject.setDeptId("设计部");
        }
    }
}
