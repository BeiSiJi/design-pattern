package com.beisiji.design_pattern.factorymethod.example2;

/**
 * Created by beisiji on 2019/5/12.
 */
public class ExportRedis implements ExportFileApi {
    @Override
    public void export(String data) {
        System.out.println("Redis导出文件, data = " + data);
    }
}
