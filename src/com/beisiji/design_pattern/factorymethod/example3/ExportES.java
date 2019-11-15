package com.beisiji.design_pattern.factorymethod.example3;

/**
 * Created by beisiji on 2019/5/12.
 */
public class ExportES implements ExportFileApi {
    @Override
    public void export(String data) {
        System.out.println("ES导出文件, data = " + data);
    }
}
