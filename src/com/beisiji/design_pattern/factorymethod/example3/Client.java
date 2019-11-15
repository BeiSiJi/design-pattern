package com.beisiji.design_pattern.factorymethod.example3;

/**
 * Created by beisiji on 2019/5/12.
 */
public class Client {

    public static void main(String[] args) {
        ExportOperate exportOperate = new ExportOperate2();
        exportOperate.export(3,"数据");
    }
}
