package com.beisiji.design_pattern.proxy.example5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by beisiji on 2019/8/2.
 * 动态代理
 */
public class DynamicProxy implements InvocationHandler {

    //持有真实对象的引用
    private OrderApi order = null;

    /**
     * 获取绑定好代理后的目标对象的接口
     * @param order 具体的目标对象
     * @return 绑定好代理后的目标对象
     */
    public OrderApi getProxyInterface(Order order){
        //设置被代理的对象，方便在Invoke里面操作
        this.order = order;
        //把真正的目标对象和动态代理关联起来
        OrderApi orderApi = (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(), order.getClass().getInterfaces(), this);
        return orderApi;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //如果是调用setter方法就检查权限
        if(method.getName().startsWith("set")){
            if(args[1] != null && order.getOrderUser().equals(args[1])){
                return method.invoke(order,args);
            }else{
                //如果不是创建人，就不能修改
                System.out.println("对不起" + args[1] + "，您没有权限修改订单中的数据");
            }
        }else{
            //不是调用setter方法直接继续
            return method.invoke(order,args);
        }
        return null;
    }
}
