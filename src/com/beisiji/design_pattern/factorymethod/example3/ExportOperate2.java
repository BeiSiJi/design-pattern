package com.beisiji.design_pattern.factorymethod.example3;

/**
 * Created by beisiji on 2019/5/12.
 * 扩展ExportOperate对象，加入可以ES导出
 */
public class ExportOperate2 extends ExportOperate {

    /**
     * 重写父类工厂方法
     * 可以全部覆盖，也可以选择自己感兴趣的覆盖，
     * 这里只想添加自己新的实现，其他的不管@param type
     * @return
     */
    @Override
    protected ExportFileApi factoryMethod(Integer type) {
        ExportFileApi api = null;
        if(3 == type){
            api = new ExportES();
        }else{
            api = super.factoryMethod(type);
        }
        return api;
    }
}
