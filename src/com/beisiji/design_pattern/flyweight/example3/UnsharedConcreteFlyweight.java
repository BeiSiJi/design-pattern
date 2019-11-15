package com.beisiji.design_pattern.flyweight.example3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beisiji on 2019/11/5.
 */
public class UnsharedConcreteFlyweight implements Flyweight {

    /**
     * 内含flyweight,是组合模式
     */
    private List<Flyweight> flyweightList = new ArrayList<>();

    @Override
    public boolean match(String securityEntity, String permit) {
        for (Flyweight flyweight : flyweightList) {
            if(flyweight.match(securityEntity,permit)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Flyweight flyweight) {
        flyweightList.add(flyweight);
    }
}
