package com.beisiji.design_pattern.state.example4;


/**
 * Created by yuanlb on 2019/1/22.
 * 正常投票
 */
public class NormalVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteContext voteContext) {
        voteContext.getMapVote().put(user,voteItem);
        System.out.println("恭喜您投票成功");

        //正常投票，维护下一个状态，下次就不能再投票了
        voteContext.getMapState().put(user,new RepeatVoteState());
    }
}