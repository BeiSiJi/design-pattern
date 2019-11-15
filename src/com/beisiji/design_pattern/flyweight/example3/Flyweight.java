package com.beisiji.design_pattern.flyweight.example3;

/**
 * Created by beisiji on 2019/11/4.
 * 享元接口
 */

public interface Flyweight {


    /**
     * 判断传入的安全实体和权限，是否和享元对象内部状态匹配
     * @param securityEntity
     * @param permit
     * @return
     */
    boolean match(String securityEntity, String permit);

    /**
     * 为flyweight添加子flyweight对象
     * @param flyweight
     */
    void add(Flyweight flyweight);
}
