package com.beisiji.design_pattern.state.example3;

/**
 * Created by yuanlb on 2019/1/22.
 * 黑名单
 */
public class BlackVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteContext voteContext) {
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}