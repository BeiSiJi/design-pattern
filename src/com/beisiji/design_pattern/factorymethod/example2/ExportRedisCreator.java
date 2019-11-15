package com.beisiji.design_pattern.factorymethod.example2;

/**
 * Created by beisiji on 2019/5/12.
 */
public class ExportRedisCreator extends ExportCreator {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportRedis();
    }
}
