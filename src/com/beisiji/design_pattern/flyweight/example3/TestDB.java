package com.beisiji.design_pattern.flyweight.example3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by beisiji on 2019/11/4.
 */
public class TestDB {

    //用来存放单独授权数据的值
    public static List<String> colDB = new ArrayList<>();

    //用来存放组合授权数据的值，key为组合数据的id，value为该组合包含的多条授权数据的值
    public static Map<String,String[]> combinationMap = new HashMap<>();


    static {
        colDB.add("张三,人员列表,查看,1");
        colDB.add("李四,人员列表,查看,1");
        colDB.add("李四,操作薪资数据,,2");

        combinationMap.put("操作薪资数据",new String[]{"薪资数据,查看","薪资数据,修改"});

        for (int i = 0; i < 3; i++){
            colDB.add("张三"+i+",人员列表,查看,1");
        }
    }
}
