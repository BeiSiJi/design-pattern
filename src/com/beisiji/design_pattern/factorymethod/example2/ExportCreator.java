package com.beisiji.design_pattern.factorymethod.example2;

/**
 * Created by beisiji on 2019/5/12.
 */
public abstract class ExportCreator {

    protected abstract ExportFileApi factoryMethod();

    public void exportFile(String data){
        ExportFileApi api = factoryMethod();
        api.export(data);
    }

}
