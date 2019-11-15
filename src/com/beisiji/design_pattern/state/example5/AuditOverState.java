package com.beisiji.design_pattern.state.example5;

/**
 * Created by yuanlb on 2019/1/22.
 *  处理审核结束的类
 */
public class AuditOverState implements LeaveRequestState {

    @Override
    public void doWork(StateMechine stateMechine) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel)stateMechine.getBusinessVO();

        //业务处理，在数据里面记录整个流程结束
    }
}