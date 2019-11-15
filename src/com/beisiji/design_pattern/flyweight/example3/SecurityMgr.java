package com.beisiji.design_pattern.flyweight.example3;


import java.util.*;

/**
 * Created by beisiji on 2019/11/5.
 */
public class SecurityMgr {

    private SecurityMgr(){}

    private static SecurityMgr securityMgr = new SecurityMgr();

    public static SecurityMgr getInstance(){
        return securityMgr;
    }

    private Map<String,Collection<Flyweight>> map = new HashMap<>();


    /**
     * 模拟用户登入
     * @param user
     */
    public void login(String user){
        Collection<Flyweight> collection = queryByUser(user);
        map.put(user,collection);
    }

    /**
     * 模拟从数据库查询用户的权限
     * @param user
     * @return
     */
    private Collection<Flyweight> queryByUser(String user) {
        List<Flyweight> col = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String ss[] = s.split(",");
            if(ss[0].equals(user)){
                Flyweight flyweight = null;
                if(ss[3].equals("2")){
                    flyweight = new UnsharedConcreteFlyweight();
                    String[] strings = TestDB.combinationMap.get(ss[1]);
                    for (String foo : strings) {
                        Flyweight childFlyweight = FlyweightFactory.getInstance().getFlyweight(foo);
                        flyweight.add(childFlyweight);
                    }
                }else{
                    flyweight = FlyweightFactory.getInstance().getFlyweight(ss[1]+","+ss[2]);
                }
                col.add(flyweight);
            }
        }
        return col;
    }

    /**
     * 判断是否有权限
     * @param user
     * @param securityEntity
     * @param permit
     * @return
     */
    public boolean hasPermit(String user,String securityEntity,String permit){
        Collection<Flyweight> flyweights = map.get(user);
        if(flyweights == null || flyweights.size() == 0){
            return false;
        }
        for (Flyweight flyweight : flyweights) {
            if(flyweight.match(securityEntity, permit)){
                return true;
            }
        }
        return false;
    }



}
