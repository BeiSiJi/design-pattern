package com.beisiji.design_pattern.state.example4;


/**
 * Created by yuanlb on 2019/1/22.
 * 重复投票
 */
public class RepeatVoteState implements VoteState {

    @Override
    public void vote(String user, String voteItem, VoteContext voteContext) {

        System.out.println("请不要重复投票");

        /**
         * 判断是否大于等于5，小于8算恶意投票
         */
        Integer count = voteContext.getMapVoteCount().get(user);
        if(count >= 5 && count < 8){
            voteContext.getMapState().put(user,new SpiteVoteState());
        }

    }
}