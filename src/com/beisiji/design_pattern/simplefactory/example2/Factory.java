package com.beisiji.design_pattern.simplefactory.example2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by beisiji on 2019/5/12.
 */
public class Factory {

    private  Factory(){};


    /**
     * 根据配制文件的参数来创建接口
     * @return
     */
    public static Api createApi(){

        Properties properties = new Properties();
        InputStream in = Factory.class.getResourceAsStream("application.properties");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Api api = null;
        try {
            Class<?> clz = Class.forName(properties.getProperty("instanceClass"));
            api = (Api) clz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return api;
    }
}
