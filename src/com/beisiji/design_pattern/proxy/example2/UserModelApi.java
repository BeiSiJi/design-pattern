package com.beisiji.design_pattern.proxy.example2;

/**
 * Created by beisiji on 2019/8/2.
 */
public interface UserModelApi {

    String getUserId();

    void setUserId(String userId);

    String getName();

    void setName(String name);

    String getDeptId();

    void setDeptId(String deptId);

    String getSex();

    void setSex(String sex);

}
