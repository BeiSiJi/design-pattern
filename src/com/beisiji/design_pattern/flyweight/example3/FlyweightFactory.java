package com.beisiji.design_pattern.flyweight.example3;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by beisiji on 2019/11/5.
 */
public class FlyweightFactory {

    private FlyweightFactory(){};

    private static FlyweightFactory factory = new FlyweightFactory();

    public static FlyweightFactory getInstance(){
        return factory;
    }

    /**
     * 缓存多个flyweight对象
     */
    private Map<String,Flyweight> map = new HashMap<>();

    /**
     * 从缓存中获取享元对象，
     * 如果缓存中有就直接返回，如果没有就先创建再返回
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key){
        Flyweight flyweight = map.get(key);
        if(Objects.isNull(flyweight)){
            flyweight = new AuthorizationFlyweight(key);
            map.put(key,flyweight);
        }
        return flyweight;
    }

}
