package com.beisiji.design_pattern.state.example5;

import java.util.Date;

/**
 * Created by yuanlb on 2019/1/22.
 * 请假单对象
 */
public class LeaveRequestModel {

    /**
     * 请假人
     */
    private String user;
    /**
     * 请假开始时间
     */
    private Date beginDate;
    /**
     * 请假天数
     */
    private int leaveDays;
    /**
     * 审核结果
     */
    private String result;


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public int getLeaveDays() {
        return leaveDays;
    }

    public void setLeaveDays(int leaveDays) {
        this.leaveDays = leaveDays;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}