package com.beisiji.design_pattern.flyweight.example3;


/**
 * Created by beisiji on 2019/11/4.
 * 封装授权数据中重复出现部分的享元对象
 */
public class AuthorizationFlyweight implements Flyweight {

    private String securityEntity;

    private String permit;


    public AuthorizationFlyweight(String state){
        String[] strings = state.split(",");
        securityEntity = strings[0];
        permit = strings[1];
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        return this.securityEntity.equals(securityEntity) && this.permit.equals(permit);
    }

    @Override
    public void add(Flyweight flyweight) {
        throw new UnsupportedOperationException("不支持的操作类型");
    }
}
