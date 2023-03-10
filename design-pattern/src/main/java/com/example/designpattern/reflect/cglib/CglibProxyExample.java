package com.example.designpattern.reflect.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @PackageName: com.example.designpattern.reflect.cglib
 * @FileName: CglibProxyExample
 * @Description:
 * @Author: Liuh
 * @Date: 2023/1/30
 */
public class CglibProxyExample implements MethodInterceptor {


    /**
     * 生成 CGLIB 代理对象
     *
     * @param cls Class 类
     * @return Class 类的 CGLIB 代理对象
     */
    public Object getProxy(Class cls) {
        // CGLIB enhancer 增强类对象
        Enhancer enhancer = new Enhancer();
        // 设置增强类型
        enhancer.setSuperclass(cls);
        // 定义代理逻辑对象为当前对象，要求当前对象实现 MethodInterceptor 方法
        enhancer.setCallback(this);
        // 生成并返回代理对象
        return enhancer.create();
    }

    /**
     * 实现代理方法
     *
     * @param o           代理对象
     * @param method      代理方法
     * @param objects     方法参数
     * @param methodProxy 方法代理
     * @return 代理返回逻辑
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("调用真实对象前");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("调用真实对象后");
        return result;
    }
}
