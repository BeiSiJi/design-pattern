package com.beisiji.design_pattern.state.example4;


/**
 * Created by yuanlb on 2019/1/22.
 * 恶意刷票
 */
public class SpiteVoteState implements VoteState {
    @Override
    public void vote(String user, String voteItem, VoteContext voteContext) {
        //取消投票资格
        String s = voteContext.getMapVote().get(user);
        if(s!=null){
            voteContext.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷票行为，取消投票资格");

        /**
         * 如果投票次数超过8次，就拉黑，进入黑名单
         */
        if(voteContext.getMapVoteCount().get(user) >= 7){
            voteContext.getMapState().put(user,new BlackVoteState());
        }
    }
}