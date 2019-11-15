package com.beisiji.design_pattern.flyweight.example1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by beisiji on 2019/8/5.
 * 享元工厂
 */
public class FlyweightFactory {


    /**
     * 缓存多个享元对象
     */
    private Map<String,Flyweight> map = new ConcurrentHashMap<>();

    /**
     * 获取key对应的享元对象
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key){
        //1.先从缓存中查找，是否存在Key对应的享元对象
        Flyweight result = map.get(key);
        //2.如果存在，就返回
        if(result == null){
            //3.如果不存在
            //3.1创建一个新的享元对象，并返回这个新的享元对象
            result = new ConcreteFlyweight(key);
            //3.2吧享元对象放到缓存里面
            map.put(key,result);
        }
        return result;
    }
}
