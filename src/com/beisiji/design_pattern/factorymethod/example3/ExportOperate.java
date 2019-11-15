package com.beisiji.design_pattern.factorymethod.example3;

/**
 * Created by beisiji on 2019/5/12.
 */
public class ExportOperate {

    public final void export(Integer type,String data){
        ExportFileApi api = factoryMethod(type);
        api.export(data);
    }

    /**
     * 提供默认的抽象方法实现，这样就算没有子类，也能够运行
     * @param type
     * @return
     */
    protected ExportFileApi factoryMethod(Integer type){
        ExportFileApi api = null;
        if(1 == type){
            api =  new ExportDB();
        }else if(2 == type){
            api = new ExportRedis();
        }
        return api;
    }
}
