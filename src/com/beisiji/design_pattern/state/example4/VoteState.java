package com.beisiji.design_pattern.state.example4;


/**
 * Created by yuanlb on 2019/1/22.
 * 封装一个投票状态相关的行为
 */

@FunctionalInterface
public interface VoteState {

    /**
     * 处理状态对应的行为
     * @param user 投票人
     * @param voteItem 投票项
     * @param voteContext 投票上下文
     */
    void vote(String user, String voteItem, VoteContext voteContext);
}