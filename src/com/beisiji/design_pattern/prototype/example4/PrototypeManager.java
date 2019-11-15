package com.beisiji.design_pattern.prototype.example4;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by beisiji on 2019/11/15.
 */
public class PrototypeManager {

    private static final Map<String,ProtoType> map = new ConcurrentHashMap<>();

    /**
     * 添加或者更新原型
     * @param key
     * @param obj
     */
    public static void add(String key,ProtoType obj){
        map.put(key,obj);
    }

    /**
     * 移除原型
     * @param key
     */
    public static void remove(String key){
        map.remove(key);
    }

    /**
     * 获取原型
     * @param key
     * @return
     */
    public static ProtoType get(String key){
        ProtoType protoType = map.get(key);
        if(Objects.isNull(protoType)){
            throw new RuntimeException("not find");
        }
        return protoType;
    }
}
