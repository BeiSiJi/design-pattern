package com.beisiji.design_pattern.state.example5;

/**
 * Created by yuanlb on 2019/1/22.
 * 处理部门经理的审核，处理后对应审核结束状态
 */
public class DepManagerState implements LeaveRequestState {

    @Override
    public void doWork(StateMechine stateMechine) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel)stateMechine.getBusinessVO();

        //业务处理，把审核结果保存到数据库中

        //部门经理审核过后，直接转向审核结束状态了
        stateMechine.setState(new AuditOverState());

        //给申请人增加一个工作，让他察看审核结果
    }
}