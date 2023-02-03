package com.example.designpattern.interceptor.impl;

import com.example.designpattern.interceptor.Interceptor;

import java.lang.reflect.Method;

/**
 * @PackageName: com.example.designpattern.Interceptor.impl
 * @FileName: MyInterceptor
 * @Description:
 * @Author: Liuh
 * @Date: 2023/2/1
 */
public class MyInterceptor implements Interceptor {
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
        System.out.println("反射方法前逻辑");
        // 不反射被代理对象（真实对象）的原有方法
        return false;
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
        System.out.println("取代被代理对象（真实对象）的方法");
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

        System.out.println("反射方法后逻辑");
    }
}
