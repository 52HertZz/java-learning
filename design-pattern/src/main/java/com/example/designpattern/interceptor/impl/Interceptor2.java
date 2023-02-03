package com.example.designpattern.interceptor.impl;

import com.example.designpattern.interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * @PackageName: com.example.designpattern.Interceptor.impl
 * @FileName: Interceptor2
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/2
 */
public class Interceptor2 implements Interceptor {
    /**
     * 它在真实对象前调用，当返回为 true 时，则反射真实对象的方法。当返回为 false 时，则调用 around 方法。
     *
     * @param proxy  代理对象
     * @param target 真实对象
     * @param method 方法
     * @param args   方法参数
     * @return
     */
    @Override
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("Interceptor2 before 方法");
        return true;
    }

    /**
     * 在 before 方法返回为 false 的情况下，调用 around 方法
     *
     * @param proxy  代理对象
     * @param target 真实对象
     * @param method 方法
     * @param args   方法参数
     * @return
     */
    @Override
    public void around(Object proxy, Object target, Method method, Object[] args) {

    }

    /**
     * 在反射真实对象方法或者 around 方法执行之后，调用 after 方法
     *
     * @param proxy  代理对象
     * @param target 真实对象
     * @param method 方法
     * @param args   方法参数
     * @return
     */
    @Override
    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.out.println("Interceptor2 after 方法");
    }
}
