package com.beisiji.design_pattern.simplefactory.example1;

/**
 * Created by beisiji on 2019/5/12.
 */
public class Factory {

    private  Factory(){};

    /**
     * 无参数的简单工厂
     * @return
     */
    public static Api createApi(){
        return new ImplA();
    }

    /**
     * 带参数的简单工厂
     * 但是会对外暴露部分实现细节
     * @param type
     * @return
     */
    public static Api createApiByType(ApiTypeEnum type){
        if(ApiTypeEnum.IMPA == type){
            return new ImplA();
        }else {
            return new ImplB();
        }
    }


    public enum ApiTypeEnum{
        IMPA,
        IMPB;

        ApiTypeEnum() {
        }
    }
}
