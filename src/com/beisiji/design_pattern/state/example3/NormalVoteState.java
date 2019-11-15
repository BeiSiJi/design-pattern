package com.beisiji.design_pattern.state.example3;

/**
 * Created by yuanlb on 2019/1/22.
 * 正常投票
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteContext voteContext) {
        voteContext.getMapVote().put(user,voteItem);
        System.out.println("恭喜您投票成功");
    }
}