package com.beisiji.design_pattern.state.example3;

/**
 * Created by yuanlb on 2019/1/22.
 * 重复投票
 */
public class RepeatVoteState implements  VoteState {

    @Override
    public void vote(String user, String voteItem, VoteContext voteContext) {
        System.out.println("请不要重复投票");
    }
}