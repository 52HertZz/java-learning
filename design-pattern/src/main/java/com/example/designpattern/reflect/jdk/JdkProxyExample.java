package com.example.designpattern.reflect.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @PackageName: com.example.designpattern.reflect.jdk
 * @FileName: JdkProxyExample
 * @Description:
 * @Author: Liuh
 * @Date: 2023/1/30
 */
public class JdkProxyExample implements InvocationHandler {

    private Object object = null;

    /**
     * 代理对象
     *
     * @param o
     * @return
     */
    public Object bind(Object o) {
        this.object = o;
        // 生成代理对象，建立代理对象和真实对象的关系
        return Proxy.newProxyInstance(o.getClass().getClassLoader(), o.getClass().getInterfaces(), this);
    }

    /**
     * 实现代理方法
     *
     * @param proxy  代理对象
     * @param method 当前调度方法
     * @param args   当前方法的参数
     * @return 代理返回结果
     * @throws Throwable 异常
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理方法！");
        System.out.println("在调用真实对象之前的服务！");
        // 相对于调用 sayHello()
        Object invoke = method.invoke(object, args);
        System.out.println("在调用真实对象之后的服务！");
        return invoke;
    }
}
