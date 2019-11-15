package com.beisiji.design_pattern.factorymethod.example2;

/**
 * Created by beisiji on 2019/5/12.
 */
public class Client {


    public static void main(String[] args) {
        ExportCreator creator = new ExportDBCreator();
        creator.exportFile("导出的数据内容");

        System.out.println("-------------");
        creator = new ExportRedisCreator();
        creator.exportFile("导出的数据内容");
    }
}
