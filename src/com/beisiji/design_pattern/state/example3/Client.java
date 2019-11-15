package com.beisiji.design_pattern.state.example3;

import com.beisiji.design_pattern.state.example1.VoteManager;

/**
 * Created by yuanlb on 2019/1/22.
 */
public class Client {

    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<8;i++){
            vm.vote("u1", "A");
        }
    }
}