package com.beisiji.design_pattern.flyweight.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beisiji on 2019/11/4.
 */
public class TestDB {

    public static List<String> colDB = new ArrayList<>();


    static {
        colDB.add("张三,人员列表,查看");
        colDB.add("李四,人员列表,查看");
        colDB.add("李四,薪资数据,查看");
        colDB.add("李四,薪资数据,修改");
        for (int i = 0; i < 3; i++){
            colDB.add("张三"+i+",人员列表,查看");
        }
    }
}
